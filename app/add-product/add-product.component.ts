import { Component, OnInit } from '@angular/core';
import { AddProductService } from '../add-product.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private addproductService: AddProductService) { }
  message: any;
  error;

 

addProduct(form: NgForm) {
    this.addproductService.addProduct(form.value).subscribe(data => {
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
