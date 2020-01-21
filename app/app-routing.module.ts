import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { EditSearchCustomerComponent } from './edit-search-customer/edit-search-customer.component';


const routes: Routes = [
  {path: '',component: HomeComponent},
  {path: 'login',component:LoginComponent},
  {path: 'addCustomerss', component: AddCustomerComponent},
  {path: 'getAllCustomers', component: EditSearchCustomerComponent},
 
  {
    path: '',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  { path: '**', redirectTo: '/home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
