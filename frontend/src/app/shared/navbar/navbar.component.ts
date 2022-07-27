import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  logoUrl: string = 'assets/logo/logo__.png';
  // logoUrl: string = 'assets/logo/logo.png';

  constructor() { }

  ngOnInit(): void {
  }

}
