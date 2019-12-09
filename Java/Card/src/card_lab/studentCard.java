/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
- Override methodgetDiscount() มีการเช็คอายุถา้นอ้ยกวา่
23 ปีใหค้ืนค่าราคาส่วนลด60 บาทเมื่อค่าที่รับเป็น “Wed”
ถา้ไม่ใช่ใหค้ืนค่าราคาส่วนลด40 บาท
แต่อายุ23 ปีข้ึนไปใหแ้ สดงขอ้ความวา่ บตัรใชไ้ม่ไดแ้ละ
คืนค่าราคาส่วนลด0 บาท
- Override methodPromotion() ให้แสดงข้อความดังผลรัน
 */
package card_lab;

/**
 *
 * @author student
 */
class studentCard extends Card {

    private int discount;

    studentCard(String name, int age,String idNum){
        super( name,  age,idNum);
        
    }

    @Override
    public int getDiscount(String day) {
     if (age<23){
         if(day.equals("Wed")){
             discount=60;
         return discount;
         }else{
              discount=40;
         return discount;
         }
     }else{
         discount=0;
         System.out.println("บัตรใช้ไม่ได้");
         return discount;
     }
    }
    @Override
    public void Promotion() {
        System.out.println(name+"wiil get discount "+80+"bath on Wednesday and 40 baths on other day");
    }
    
}
