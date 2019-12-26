import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators, AbstractControl } from '@angular/forms';
import { AppURL } from '../app.url';
import { IRegisterComponent } from './register.interface';
import { CompileShallowModuleMetadata } from '@angular/compiler';
import { AlertService } from '../authentication/shareds/services/alret.service';
declare let $;
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements IRegisterComponent {
  constructor(  
    private builder : FormBuilder,
    private alert: AlertService
    ) {
      this.initialCreateFormData();
      

   }
  form: FormGroup;
  Url=AppURL;
 
    //   register
  onSubmit(){
    if(this.form.invalid){
       return this.alert.notify();
    }
  
   //return alert('something wrong, please try again');
    console.log(this.form.value)

  }
  private initialCreateFormData(){
    //   create form
    this.form = this.builder.group({
      firstname:['',[Validators.required]],
      lastname:['',[Validators.required]],
      email:['',[Validators.required]],
      password:['',[Validators.required]],
      cpassword:['',[Validators.required,this.comparePassword('password')]],
    });
  }

  //create valid for check password

  private comparePassword(passwordField:string){
    return function(confirm_password :AbstractControl){
      if(!confirm_password.parent) return;
      const password = confirm_password.parent.get(passwordField);
      const passwordSubscripe= password.valueChanges.subscribe(() =>{
          confirm_password.updateValueAndValidity();
          passwordSubscripe.unsubscribe();
      });
      if(confirm_password.value==password.value)
        return;
      return{ compare:true};

    }
  }

}
