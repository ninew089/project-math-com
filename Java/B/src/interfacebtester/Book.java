/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacebtester;

/**
 *
 * @author student
 */
public class Book{
    private int id;         // เลขที่ id ของหนังแต่ละเรื่อง
    private String name;    // ชื่อหนัง
    private boolean isRented;   // สถานะการเช่า ถ้าถูกเช่าแล้วจะเป็น true ถ้าไม่ถูกเช่าเป็น false
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setRentalStatus(int n) {    // เปลี่ยนสถานะการเช่า
        if (n == 1)     // ถ้า n เป็น 1 คือถูกเช่า         
            isRented = true;
        else            // ถ้า n เป็น 2 คือไม่ถูกเช่าแล้ว
            isRented = false;
    }
    public boolean getRentalStatus() {
        return isRented;
    }
}
