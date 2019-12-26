import { Component, OnInit } from '@angular/core';
import { IAuthSidebarComponent } from './auth.siderbar.interface';
import { AuthURL } from 'src/app/authentication/authentication.url';
import { AppURL } from 'src/app/app.url';
import { IAccount, AccountService } from '../../services/account.service';
import { AuthenService } from 'src/app/services/authen.service';
import { AlertService } from '../../services/alret.service';
import { Route } from '@angular/compiler/src/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-auth-sidebar',
  templateUrl: './auth-sidebar.component.html',
  styleUrls: ['./auth-sidebar.component.css']
})
export class AuthSidebarComponent implements OnInit,IAuthSidebarComponent {


 
  constructor(
    private account:AccountService,
    private authen:AuthenService,
    private alert:AlertService,
    private router:Router
  ) { 
    this.initialLoadUserLogin();
  }

  ngOnInit() {
    
  }
  AppURL=AppURL;
  AuthURL=AuthURL
  UserLogin:IAccount;

  //load INFORMATION USER LOGIN FROM token
  private initialLoadUserLogin(){
    this.account
        .getUserLogin(this.authen.getAuthenticated())
        .then(UserLogin => this.UserLogin = UserLogin)
        .catch(err =>{
          this.alert.notify();
          this.authen.clearAuthentiated();
          this.router.navigate(['/',AppURL.Login]);
        });
  }
}
