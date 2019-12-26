import { Component, OnInit } from '@angular/core';
import {AppURL} from '../app.url';
import { AppRoutingModule } from '../app-routing.module';
import { IloginComponent } from './login.interface';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AlertService } from '../authentication/shareds/services/alret.service';
import { Route } from '@angular/compiler/src/core';
import { Router } from '@angular/router';
import { AuthURL } from '../authentication/authentication.url';
import { AccountService } from '../authentication/shareds/services/account.service';
import { AuthenService } from '../services/authen.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements IloginComponent {
 

    constructor(
      private builder:FormBuilder,
      private alert:AlertService,
      private router: Router,
      private account:AccountService,
      private authen:AuthenService
  
    ) { 
      this.initialCreateFormData();
    }
    Url =AppURL;
    
    form: FormGroup
    // for login
    onSubmit():void{
      if(this.form.invalid)
        return this.alert.notify();
      this.account
          .onLogin(this.form.value)
          .then(res=>{
              console.log(res);
              //   เก็บ session
              this.authen.setAuthenticated(res.accessToken)
              // redirect หน้า DASH BOARD
              this.router.navigate(['/',AppURL.Authen,AuthURL.Dashboard])
      
          })
          .catch(err =>this.alert.notify())

        
      
    }
    // create form
    private initialCreateFormData(){
        this.form=this.builder.group({
          userid:['',Validators.required],
          password:['',Validators.required],
      })
    }
  
}
