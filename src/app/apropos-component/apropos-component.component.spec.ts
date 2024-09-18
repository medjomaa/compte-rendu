import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AProposComponentComponent } from './apropos-component.component';

describe('AProposComponentComponent', () => {
  let component: AProposComponentComponent;
  let fixture: ComponentFixture<AProposComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AProposComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AProposComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
