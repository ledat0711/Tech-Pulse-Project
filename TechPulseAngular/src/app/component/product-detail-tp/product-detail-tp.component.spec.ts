import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductDetailTpComponent } from './product-detail-tp.component';

describe('ProductDetailTpComponent', () => {
  let component: ProductDetailTpComponent;
  let fixture: ComponentFixture<ProductDetailTpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductDetailTpComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductDetailTpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
