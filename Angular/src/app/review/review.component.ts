import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.scss']
})
export class ReviewComponent implements OnInit {

  constructor(private service : UserServiceService) { }

    showmsg: boolean = false;
    public review={
        rev : ''
    }
  ngOnInit(): void {
  }

  

public feedForm(){
    
  let response = this.service.review(this.review);
  response.subscribe(data => {
    this.showmsg = true;
  })
}

}
