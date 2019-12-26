import { Component, OnInit } from '@angular/core';
import{AppURL} from '../../../app.url';
import{AuthURL} from '../../authentication.url';
import { Router } from '@angular/router';
import { IAccount, AccountService } from '../../shareds/services/account.service';
import { IAuthSidebarComponent } from '../../shareds/components/auth-sidebar/auth.siderbar.interface';
import { AlertService } from '../../shareds/services/alret.service';
import { AuthenService } from 'src/app/services/authen.service';
@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit,IAuthSidebarComponent {

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