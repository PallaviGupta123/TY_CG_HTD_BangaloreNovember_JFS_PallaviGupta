import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddProductService {

  constructor(private http: HttpClient) { }
  addProduct(product): Observable<any> {
    return this.http.post<any>
    ('http://localhost:2020/addProduct', product);
  }

  getAllProduct(): Observable<any> {
    return this.http.get<any>
    ('http://localhost:2020/getAllProduct');
  }
//   deleteProduct(product: Product): Observable<any> {
//     return this.http.delete<any>
//  (`http://localhost:2020/deleteCustomer/${customer.customerId}`);
//   }
  
}
