import { Component, OnInit } from '@angular/core';
import { AddCustomerService } from '../add-customer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit-search-customer',
  templateUrl: './edit-search-customer.component.html',
  styleUrls: ['./edit-search-customer.component.css']
})
export class EditSearchCustomerComponent implements OnInit {

  error: string;
  success: string;
  customers: Customer[];
  constructor(private customerService: AddCustomerService,
              private router: Router) {
    this.getAllCustomersForm();
   }

  ngOnInit() {
  }
  getAllCustomersForm() {
    this.customerService.getAllCustomers().subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        this.customers = response.customer;
        this.success = response.description;
        localStorage.setItem('Customer Details', JSON.stringify(response));
        setTimeout(() => {
          this.success = null;
        }, 2000);
      } else {
        this.error = response.description;
        localStorage.setItem('Customer Details', JSON.stringify(response));
        console.log('product Details are founded');
        setTimeout(() => {
          this.error = null;
        }, 3000);
      }
    });
  }

  deleteCustomersForm(customer: Customer) {
    this.customerService.deleteCustomers(customer).subscribe(data => {
      console.log(data);
      if (data.statusCode === 201) {
        this.customers.splice(this.customers.indexOf(customer), 1);
        this.success = data.message;
      }
    });
  }
}