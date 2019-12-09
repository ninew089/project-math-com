package exceptionproject;

import java.util.Random;
import java.util.Scanner;

class LowerException extends Exception {

}
class UpperException extends Exception {

}
class EqualException extends Exception {
    
}
public class Exception3 {
    static int randNum = (new Random()).nextInt(100);
    static void guess(int num) throws LowerException,UpperException,EqualException{
        if(num<randNum) {
            throw new LowerException();
        } else if(num>randNum) {
            throw new UpperException();
        } else {
            throw new EqualException();
        }
    }
    public static void main(String[] args) {
        // จัดการ guess num โดยที่
        // สมมติว่ารับค่าจาก keyboard num = 12
        // หากมี LowerException ออกมาให้ พิมพ์ว่า 12 is lower.
        // หากมี UpperException ออกมาให้ พิมพ์ว่า 12 is upper.
        // หากมี UpperException ออกมาให้ พิมพ์ว่า 12 is equal. และให้หยุดการวนลูป
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Please input you number between 0-99 : ");
            int num = sc.nextInt();
            
            try{guess(num);}
            catch(LowerException e){System.out.println(num+" is lower.");}
            catch(UpperException e){System.out.println(num+" is upper.");}
            catch(EqualException e){System.out.println(num+" is equal.");break;}
            
        }
    } 
}
