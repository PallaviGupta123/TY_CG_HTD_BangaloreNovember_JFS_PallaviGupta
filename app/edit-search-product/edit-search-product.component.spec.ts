import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditSearchProductComponent } from './edit-search-product.component';

describe('EditSearchProductComponent', () => {
  let component: EditSearchProductComponent;
  let fixture: ComponentFixture<EditSearchProductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditSearchProductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditSearchProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
