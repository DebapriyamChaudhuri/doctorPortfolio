import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BodyComponent } from './body/body.component';
import { ReviewComponent } from './review/review.component';

const routes: Routes = [

  {
    path: '',
    component: BodyComponent
  },
  {
    path: 'review',
    component: ReviewComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
