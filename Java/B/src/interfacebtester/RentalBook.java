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
public class RentalBook implements ShopInterface,Comparable <RentalBook> {

    private String name;            // ชื่อคนดูแลธุรกิจ
    private double income;          // รายรับ
    ArrayList<Book> book = new ArrayList<>();       // อาร์เรย์ลิสต์เก็บ object ของหนัง

    public RentalBook(String n) {
        name = n;
        book.add(new Book(101, "บุพเพสันนิวาส"));
        book.add(new Book(102, "กาหลมหรทึก"));
        book.add(new Book(103, "เลี้ยงลูกอย่างไรให้ได้ EF"));
        book.add(new Book(104, "คิดมากไปหรือเปล่า?"));
        book.add(new Book(105, "ยอดหญิงหมอเทวดา5"));
        book.add(new Book(106, "The Lord of the Rings"));
        book.add(new Book(107, "The Little Prince"));
        book.add(new Book(108, "Harry Potter and the Sorcerer's Stone"));
        book.add(new Book(109, "The Hobbit"));
        book.add(new Book(110, "The Da Vinci Code"));
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }
// ให้นิสิตเขียน implement method rent() เพื่อเช่าหนังสือ
/* method นี้ จะเข้าไปหาในอาร์เรย์ลิสต์ตั้งแต่ต้นอาร์เรย์ลิสต์เพื่อหาหนังสือที่ยังไม่ได้ถูกเช่าออกไป 
    ถ้าพบหนังสือที่ยังไม่ได้ถูกเช่าไป จะ set เป็นถูกเช่า และคืนค่าว่า You got book id อะไร และชื่อหนังสือ
    ถ้าหนังสือถูกเช่าออกไปหมดแล้ว ให้คืนค่าว่า Books are not available
     */
    public String rent() {
        String str = null;
        int cnt = 0;
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getRentalStatus() == false) {
                book.get(i).setRentalStatus(1);
                str = "You got book id: " + book.get(i).getID() + book.get(i).getName();
                break;
            } else {
                cnt += 1;
            }
             if (cnt>0){
            str = "Books are not available";
        }
        }
       
        return str;
    }
            
            

// ให้นิสิตเขียน implement method ret() เพื่อคืนหนังสือ
/* method นี้ จะรับค่า เลขที่ id หนังสือ และจำนวนวันที่เช่าไป n 
    คำนวณหารายรับ ถ้า n อยู่ในช่วง 3 วันจะคิดวันละ 1 บาท แต่หากเกิน 3 วัน 3 วันแรกคิดวันละ 1 บาท และวันที่เกินจะคิดวันละ 5 บาท
    และ set หนังสือเป็น ไม่ถูกเช่า แล้ว
             */
    
     public void ret(int id, int n) {
         for(int i=0; i<book.size(); i++){
             if(book.get(i).getID()==id){
                 book.get(i).setRentalStatus(2);
             }
         }
      if(n<=3){
          income = income+ n;
      }else{
          n-=3;
          income = income + 3+ (n*5);
      }
     }
// ให้นิสิตเขียน implement method compareTo() โดย return ค่า -1, 0, 1
/* method นี้ จะรับ object เข้ามาเพื่อเปรียบเทียบรายรับกับ object ที่เรียกใช้ method นี้
    ถ้ารายรับของ object ที่เรียกใช้ method นี้น้อยกว่าอีก object จะคืนค่า -1
    ถ้าเท่ากัน คืน 0 และถ้ามากกว่า คืน 1
             */
     public int compareTo(RentalBook e){
         if (e.getIncome() < income){
             return -1;
         }else if(e.getIncome() == income){
             return 0;
         }else
             return 1;
     }

    

        }
     
