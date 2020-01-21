import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AddCustomerService } from '../add-customer.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  
  constructor(private addcustomerService: AddCustomerService) { }
  message: any;
  error;

 

  addCustomer(form: NgForm) {
    this.addcustomerService.addCustomer(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      setInterval(() => {
        this.message = null;
      }, 3000);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.message;
    })
  }

  ngOnInit() {
  }

}
