import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
// tslint:disable-next-line: import-spacing
import {HttpClientModule}  from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AddCustomerComponent } from './add-customer/add-customer.component';
import { EditSearchCustomerComponent } from './edit-search-customer/edit-search-customer.component';
import { AddContractorComponent } from './add-contractor/add-contractor.component';
import { AddProductComponent } from './add-product/add-product.component';
import { EditSearchContractorComponent } from './edit-search-contractor/edit-search-contractor.component';
import { EditSearchProductComponent } from './edit-search-product/edit-search-product.component';
import { UpdateCustomerComponent } from './update-customer/update-customer.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    LoginComponent,
    HomeComponent,
    AddCustomerComponent,
    EditSearchCustomerComponent,
    AddContractorComponent,
    AddProductComponent,
    EditSearchContractorComponent,
    EditSearchProductComponent,
    UpdateCustomerComponent
   
   
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule,
    RouterModule.forRoot([
      {path: '', redirectTo: 'home', pathMatch: 'full'},
      {path: 'addCustomerss', component: AddCustomerComponent},
      {path: 'editsearchCustomer', component: EditSearchContractorComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
