import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductDetailComponent} from './component/product-detail/product-detail.component';
import {ProductDetailTpComponent} from './component/product-detail-tp/product-detail-tp.component';
import {HomeComponent} from './component/home/home.component';

const routes: Routes = [
  //  {path: 'products', component: ListProductsComponent, canActivate: [AdminGuard]},
  {path: 'product-detail', component: ProductDetailComponent},
  {path: '', component: HomeComponent},
  {path: 'product-detail-tp', component: ProductDetailTpComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
