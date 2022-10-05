import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeroesScreenComponent } from './heroes-screen/heroes-screen.component';
import { HeroListitemComponent } from './hero-listitem/hero-listitem.component';



@NgModule({
  declarations: [
    HeroesScreenComponent,
    HeroListitemComponent
  ],
  imports: [
    CommonModule
  ],
  exports:[
    HeroesScreenComponent
  ]
})
export class HeroesModule { }
