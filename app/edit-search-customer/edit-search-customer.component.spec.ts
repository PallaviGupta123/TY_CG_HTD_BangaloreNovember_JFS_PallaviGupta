import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditSearchCustomerComponent } from './edit-search-customer.component';

describe('EditSearchCustomerComponent', () => {
  let component: EditSearchCustomerComponent;
  let fixture: ComponentFixture<EditSearchCustomerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditSearchCustomerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditSearchCustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
