import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  formModel: any = {};

  constructor(private router: Router) { }

  ngOnInit() {
  }

  validateLogin() {
    console.log('form value', this.formModel);
    this.router.navigate(['/']);
  }

}
