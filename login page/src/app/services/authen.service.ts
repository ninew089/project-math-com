import { Injectable } from "@angular/core";


@Injectable(
{providedIn: 'root'}
)
export class AuthenService{
    private accessKey ='ssKey';
        //  กำหนดค่า ไว้ในความจำbrowser
    setAuthenticated(accessToken:string){
        localStorage.setItem(this.accessKey,accessToken);
    }
        //  ดึงค่า access TOKEN ออกมาในหน่วย ความจำbrowser
    getAuthenticated():string{
        return localStorage.getItem(this.accessKey)
    }  
      // ลบค่า  access token ที่อยู่ในความจำBROWSER
    clearAuthentiated():void{
        localStorage.removeItem(this.accessKey);
    }

}