package exceptionproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception1 {
    public static void printString(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
//  Uncheck exception ไม่ต้องการการดัก exception ด้วย try-catch แต่สามารถ throw exception ออกมาได้
//  กำหนดให้นิสิต uncomment และ พิจารณา error เรียกรัน ดูผลลัพธ์ จะมีรายงานว่า error เพราะอะไร
//  และ ลอง ดัก ด้วย exception ที่รายงานด้านล่าง
//  ให้ตรงกับ exception ที่เกิด ห้ามใช้ Exception และ RuntimeException ตัวอย่างการจัดการดังข้อความด้านล่าง
//  try {
//      ....
//  catch(......) {
//      System.out.println("Error from ...... Exception");
//  }

//  1.
       try{ 
        Random r = null;
        int randNum = r.nextInt();
       }
       catch(NullPointerException e){System.out.println("Error from NullPointer Exception");}
//  2.
        try{
        int num=Integer.parseInt ("XYZ") ;
	System.out.println(num);
        }
        catch(NumberFormatException e) {System.out.println("Error from NumberFormat Exception");}
//  3.
        try {
        int arr[] = {0,1,2,3,4};
        arr[5]=5;}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("Error from ArrayIndexOutOfBounds Exception");}


//  Check exception เป็น Exception ที่จำเป็นต้องมีการตรวจสอบ หากไม่ตรวจสอบหรือเขียน try catch จะไม่สามารถ
//  รันได้ ต้องจัดการ Exception ตั้งแต่ใน code 
//  เมื่อ uncomment แล้วจะมี ขีดเส้นแดง ๆ เลือกดวงไป จะมีทางเลือกที่ควรจัดการ 2 อย่าง
//  1. โยนต่อ จะเป็นปัญหาต่อไป ให้กับ คนที่เรียกใช้เรา (Add throw ..)
//  2. จัดการด้วย try catch จะทำให้ปัญหาทั้งหมดจบที่ตรงนี้ ทดลองเลือกดู ในระดับครอบ statement นะครับ
// ในส่วนของ Catch ให้ System.out.println("Error from ...... Exception");

//  4.
        try {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e){System.out.println("Error from FileNotFoundException Exception");}
//        

        
    }
}
