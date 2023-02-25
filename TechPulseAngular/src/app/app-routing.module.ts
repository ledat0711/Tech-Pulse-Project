import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductDetailComponent} from './component/product-detail/product-detail.component';
import {HomeComponent} from './component/home/home.component';
import {LoginComponent} from './component/security/login/login.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'product-detail', component: ProductDetailComponent},
  {path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
