/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceproject;

/**
 *
 * @author werapan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // สร้าง object cal1 โดยกำหนดค่า 10 และ 20 ลงใน object
        Calculator cal1 = new Calculator(10, 20);
        // ทดสอบ ให้ตัวเลขใน object บวกกัน 10+20
        System.out.println("Result1 : " + cal1.plus());
        // ทดสอบ ให้ตัวเลขใน object ลบกัน 10-20
        System.out.println("Result2 : " + cal1.minus());
        // เรียกผลลัพธ์สุดท้ายและแสดงผลทางหน้าจอ
        System.out.println("Result3 : " + cal1.getResult());
        
        // สร้าง object cal2 จาก AdvCalculator โดยกำหนดค่า 10 และ 20 ลงใน object
        AdvCalculator cal2 = new AdvCalculator(10, 2);
        // ทดสอบ ให้ตัวเลขใน object บวกกัน 10+2
        System.out.println("Result4 : " + cal2.plus());
        // ทดสอบ ให้ตัวเลขใน object ลบกัน 10-2
        System.out.println("Result5 : " + cal2.minus());
        // เรียกผลลัพธ์สุดท้ายและแสดงผลทางหน้าจอ
        System.out.println("Result6 : " + cal2.getResult());
        // ทดสอบ ให้ตัวเลขใน object คูณกัน 10*2
        System.out.println("Result7 : " + cal2.multiply());
        // ทดสอบ ให้ตัวเลขใน object หารกัน 10/2
        System.out.println("Result8 : " + cal2.division());
        // ทดสอบ ให้ตัวเลขใน object ยกกำลังกัน 10^2
        System.out.println("Result9 : " + cal2.power());
        // เรียกผลลัพธ์สุดท้ายและแสดงผลทางหน้าจอ
        System.out.println("Result10 : " + cal2.getResult());
    }
    
}
