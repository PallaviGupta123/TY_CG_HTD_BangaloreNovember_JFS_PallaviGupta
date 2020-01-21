import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddCustomerService {
 // api = 'http://localhost:2020/';
  constructor(private http: HttpClient) { }

  addCustomer(customer): Observable<any> {
    return this.http.post<any>
    ('http://localhost:2020/addCustomerss', customer);
  }

  getAllCustomers(): Observable<any> {
    return this.http.get<any>
    ('http://localhost:2020/getAllCustomers');
  }
  deleteCustomers(customer: Customer): Observable<any> {
    return this.http.delete<any>
 (`http://localhost:2020/deleteCustomer/${customer.customerId}`);
  }
  
}
