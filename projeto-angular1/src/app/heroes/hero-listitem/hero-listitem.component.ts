import { Component, Input, OnInit } from '@angular/core';
import { Hero } from '../heroes-screen/heroes-screen.component';


@Component({
  selector: 'app-hero-listitem',
  templateUrl: './hero-listitem.component.html',
  styleUrls: ['./hero-listitem.component.css']
})
export class HeroListitemComponent implements OnInit {

  @Input() hero!: Hero;
  
  constructor() { }

  ngOnInit(): void {
  }

  showID = () => {
    alert(this.hero.secretIdentity ?? 'Desconhecido')
  }

}
