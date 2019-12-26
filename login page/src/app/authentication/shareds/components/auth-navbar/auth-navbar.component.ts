import { Component, OnInit } from '@angular/core';
import{AppURL} from '../../../../app.url'
import{AuthURL} from '../../../authentication.url'
import { Router } from '@angular/router';

@Component({
  selector: 'app-auth-navbar',
  templateUrl: './auth-navbar.component.html',
  styleUrls: ['./auth-navbar.component.css']
})
export class AuthNavbarComponent implements OnInit {

  constructor(
    private router: Router
  ) { }

  ngOnInit() {
  }
  AppURL =AppURL;
  AuthURL=AuthURL;
  onLogout(){
    this.router.navigate(['/',AppURL.Login])
  }

}
