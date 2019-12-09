/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacebtester;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class InterfaceBTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ให้นิสิตเขียนคำสั่งสร้างอาร์เรย์ลิสต์ ชื่อ sh
        ArrayList<ShopInterface> sh = new ArrayList<>();

        // สร้าง 3 ธุรกิจเก็บในอาร์เรย์ลิสต์
        sh.add(new RentalBook("Sasipa"));
        sh.add(new RentalBook("Weeris"));
        sh.add(new RentalCar("Monnat"));
        // เช่าหนังสือ และเช่ารถ
        System.out.println(sh.get(0).rent());    // เช่าหนังสือจากร้านของศศิภา
        System.out.println(sh.get(0).rent());    // เช่าหนังสือจากร้านของศศิภา
        System.out.println(sh.get(1).rent());    // เช่าหนังสือจากร้านของวิริศ
        System.out.println(sh.get(1).rent());    // เช่าห้องพักจากร้านของวิริศ
        System.out.println(sh.get(2).rent());    // เช่ารถจากร้านของมนนัทธ์
        System.out.println(sh.get(2).rent());    // เช่ารถจากร้านของมนนัทธ์
        // คืนหนังสือ และคืนรถ
        sh.get(0).ret(101, 2); // คืนหนังสือ id 101 โดยเช่าไป 2 วัน
        sh.get(0).ret(102, 5); // คืนหนังสือ id 102 โดยเช่าไป 5 วัน
        sh.get(1).ret(101, 2); // คืนหนังสือ id 101 โดยเช่าไป 2 วัน
        sh.get(1).ret(102, 5); // คืนหนังสือ id 102 โดยเช่าไป 5 วัน
        sh.get(2).ret(0, 0); // คืนรถ id 0 โดยเช่าไม่เกิน 1 วัน
        sh.get(2).ret(1, 2); // คืนรถ id 1 โดยเช่าเกินไป 2 วัน

        
        // ให้นิสิตเขียนคำสั่งเพื่อแสดงชื่อและรายได้ของทั้งสามร้าน
        

        // เรียกใช้ method compareTo() เพื่อเปรียบเทียบข้อมูลรายได้ของร้านหนังสือของศศิภา (s) และวีริศ (w)
        
    }

}
