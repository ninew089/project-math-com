
import {Routes,RouterModule} from '@angular/router'
import { AuthURL } from './authentication.url';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ProfileComponent } from './components/profile/profile.component';


const RouteLists: Routes =[
    {path:'',redirectTo:AuthURL.Dashboard,pathMatch:'full'},
    {path:AuthURL.Dashboard,component:DashboardComponent},
    {path:AuthURL.Profile,component:ProfileComponent},

];
export const AuthenticationRouting =RouterModule.forChild(RouteLists);