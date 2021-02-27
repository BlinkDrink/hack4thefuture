import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HelpSomeoneComponent } from './help-someone.component';

describe('HelpSomeoneComponent', () => {
  let component: HelpSomeoneComponent;
  let fixture: ComponentFixture<HelpSomeoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HelpSomeoneComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HelpSomeoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
