import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AuthenticationRouting} from './authentication.routing';
import { SharedsModule } from './shareds/shareds.module';
import { ProfileComponent } from './components/profile/profile.component';



@NgModule({
  declarations: [
    DashboardComponent,
     ProfileComponent
    ],
  imports: [
    CommonModule,
    AuthenticationRouting
    ,SharedsModule
  ],
 
})
export class AuthenticationModule { }
