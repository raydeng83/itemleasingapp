import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllItemsComponent } from './all-items.component';

describe('AllItemsComponent', () => {
  let component: AllItemsComponent;
  let fixture: ComponentFixture<AllItemsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllItemsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllItemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
