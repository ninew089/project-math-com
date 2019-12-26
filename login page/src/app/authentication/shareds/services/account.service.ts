import{Injectable} from '@angular/core';
import { ILogin } from 'src/app/login/login.interface';
@Injectable()

export class AccountService{
    private mockUserItems:IAccount[]=[
         {
            id: 1,
            firstname:'Antony',
            lastname:'Michel',
            userid:'milopbo',
            email:'identity@gmail.com',
            password:'1234',
            birthday:'01.01.1999',
            possition:'Master',
            address:'Bangkok,10250',
            image:"https://i1.wp.com/thefairfinch.com/wp-content/uploads/2018/10/IMG_8426.jpg?resize=819%2C1024&ssl=1",
            tel:"099-099-9999",
            created: new Date(),
            updated: new Date()
           
            }
        
    ];
    // get userlogin
    getUserLogin(accessToken: string) {
        return new Promise<IAccount>((resolve, reject) => {
            const userLogin = this.mockUserItems.find(m => m.id == accessToken);
            if (!userLogin) return reject({ Message: 'accessToken ไม่ถูกต้อง' });
            resolve(userLogin);
        });
    }
    //  login
    onLogin(model: ILogin) {
        return new Promise<{ accessToken: string }>((resolve, reject) => {
            const userLogin = this.mockUserItems.find(item => item.userid == model.userid && item.password == model.password);
            if (!userLogin) return reject({ Message: 'ชื่อผู้ใช้งานหรือรหัสผ่านไม่ถูกต้อง' });
            resolve({
                accessToken: userLogin.id
            });
        });
    }
    

   


}
export interface IAccount{
    firstname:string;
    lastname:string;
    userid:string;
    email:string;
    password:string;
    tel?:string;
    id?:any;
    possition?:string;
    image?:string;
    created?:Date;
    updated?:Date;
    birthday?:string;
    address?:string;
}
