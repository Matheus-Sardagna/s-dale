import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Hero } from '../heroes-screen/heroes-screen.component';

@Component({
  selector: 'app-heroes-form',
  templateUrl: './heroes-form.component.html',
  styleUrls: ['./heroes-form.component.css']
})
export class HeroesFormComponent {

  @Input() editingHero? : Hero;
  @Output() insertChange = new EventEmitter<boolean>();
  @Output() heroSave = new EventEmitter<Hero>();

  ngOnChanges(changes: SimpleChanges): void {
    this.heroForm.pachValue(changes.editingHero)
  }

  heroForm = this.fb.group({
    id: [null]
    name: ['', Validators.required],
    secretIdentity: [''],
    
    universe: ['']
  });

  cancel = () => {
    this.insertChange.emit(false);
  }

  onSubmit = () => {
    this.heroSave.emit(this.heroForm.value as Hero);
  }

  constructor(private fb: FormBuilder){}

}
