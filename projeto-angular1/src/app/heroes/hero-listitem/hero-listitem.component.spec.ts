import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroListitemComponent } from './hero-listitem.component';

describe('HeroListitemComponent', () => {
  let component: HeroListitemComponent;
  let fixture: ComponentFixture<HeroListitemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeroListitemComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeroListitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
