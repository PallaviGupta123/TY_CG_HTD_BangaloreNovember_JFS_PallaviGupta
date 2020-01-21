import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditSearchContractorComponent } from './edit-search-contractor.component';

describe('EditSearchContractorComponent', () => {
  let component: EditSearchContractorComponent;
  let fixture: ComponentFixture<EditSearchContractorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditSearchContractorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditSearchContractorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
