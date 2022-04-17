import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';





@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.scss']
})
export class BodyComponent implements OnInit {


  message:boolean = false;
  notIf:boolean = false;
  constructor(private service : UserServiceService) { }

  public user={
        name : '',
        email : '',
        ph : '',
        age : '',
        sex : '',
        height : '',
        weight : '',
        ftime : '',
        ttime : '',
        date : ''
  }



  ngOnInit(): void {
  }
  public submitForm(){
    let response = this.service.bookapp(this.user);
    
    response.subscribe(data => {
      var x = "Time-slot is not availble";
      if(data.toString()===x){
        this.notIf = true;
      }
      else{
        this.message = true;
      }
        
      
      
    })
  }



}
