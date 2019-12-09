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
public class RentalCar implements ShopInterface {

    private String owner;                // ชื่อคนดูแลธุรกิจ
    boolean room[] = new boolean[10];   // อาร์เรย์เก็บสถานะว่ารถ 10 คัน ถูกเช่าไปแล้วหรือไม่
    private double income;              // รายรับ
    static final int rate = 2000;      // ค่าเช่ารถวันละ 2000 บาท

    public RentalCar(String n) {
        owner = n;
    }

    public String getOwner() {
        return owner;
    }

    public double getIncome() {
        return income;
    }
// ให้นิสิตเขียน implement method rent() เพื่อเช่ารถ
/* method นี้ จะเข้าไปหาในอาร์เรย์ตั้งแต่ต้นอาร์เรย์เพื่อหๅรถว่าง 
    ถ้าพบรถว่างจะ set เป็นถูกเช่า คำนวณรายรับ และคืนค่าว่า You got car id อะไร
    ถ้ารถถูกเช่าไปหมดแล้ว ให้คืนค่าว่า Cars are not available
     */
    public String rent() {
        String str = null;
        int cnt = 0;
        for (int i = 0; i < room.length; i++) {
            if (room[i] == false) {
                room[i] = true;
                income += rate * 2;
                str = "You got car id: " + i;
                break;
            } else {
                cnt += 1;
            }
            if (cnt == room.length - 1) {
                str = "Cars are not available";
            }
        }
        return str;
    }

// ให้นิสิตเขียน implement method ret() // เพื่อคืนรถ
/* method นี้ จะรับค่า เลขที่ id ของรถ และจำนวนวันที่เช่าเกิน 1 วัน 
    ถ้า n เป็น 0 คือไม่ได้เช่าเกิน 1 วัน คืนเงินมัดจำให้กับลูกค้า
    ถ้าเช่าเกิน 1 วัน จะได้รายรับเพิ่ม คือเงินค่าเช่าของวันที่เกินมา และ set ห้องเป็น ไม่ถูกเช่า แล้ว
     */
    public void ret(int id, int n) {
        for(int i=0;i<room.length;i++){
            
        if (n > 0) {
            
            income += (2000 * n) + rate;
          
        } else {
            income -= 2000;
        }
    }}
}
