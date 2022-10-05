import { Component, OnInit } from '@angular/core';

export type Hero = {
  id: number,
  heroName: string,
  secretIdentity?: string,
  universe: "marvel" | "DC",
  dead?: boolean
}

@Component({
  selector: 'app-heroes-screen',
  templateUrl: './heroes-screen.component.html',
  styleUrls: ['./heroes-screen.component.css']
})
export class HeroesScreenComponent implements OnInit {

  heroes: Hero[] = [{
    id: 1,
    heroName: "Iron man",
    universe: "marvel",
    secretIdentity: "Tony Stark",
    dead: true
  },
  {
    id: 2,
    heroName: "Super-man",
    universe: "DC",
    dead: false
  },
  {
    id: 3,
    heroName: "Spider-man",
    universe: "marvel",
    secretIdentity: "Peter Parker",
    dead: false
  },
  {
    id: 3,
    heroName: "Hulk",
    universe: "marvel",
    secretIdentity: "Dr. Robert Bruce Banner",
    dead: false
  },
  {
    id: 4,
    heroName: " Aquaman",
    universe: "DC",
    dead: false
  }
  

]

  constructor() { }

  ngOnInit(): void {
  }

}
