import { TestBed } from '@angular/core/testing';

import { AddContractorService } from './add-contractor.service';

describe('AddContractorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AddContractorService = TestBed.get(AddContractorService);
    expect(service).toBeTruthy();
  });
});
