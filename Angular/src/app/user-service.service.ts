import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor(private http : HttpClient) { }

  public bookapp(user: any) : Observable<object>{
    return  this.http.post("http://localhost:8080/student/add", user, {responseType : "text" as "json"});

  }

  public review(review: any){
    return  this.http.post("http://localhost:8080/review/add", review, {responseType : "text" as "json"});

  }

  public sentMsg(sms: any){
    return this.http.post("http://localhost:8080/sms", sms, {responseType : "text" as "json"});
  }
}
