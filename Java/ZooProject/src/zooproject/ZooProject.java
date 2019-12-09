/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

/**
 *
 * @author werapan
 */
public class ZooProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      1. เรียกรันและดูผลลัพธ์
//      สร้าง object แมว
        Cat cat1 = new Cat("cat1");
//        สั่งให้แมวร้อง
        cat1.sound();
//      สร้าง object หมา
        Dog dog1 = new Dog("dog1");
//      สั่งให้หมาร้อง          
        dog1.sound(); 
        
//      2. จง สร้าง class Crow, Frog, Owl โดยเลียนแบบจาก Cat และ Dog สืบทอดจาก Animal
//      โดยเสียง จะถูกเก็บไว้ใน project folder ประกอบไปด้วย dog.wav, cat.wav, crow.wav, frog.wav, owl.wav
//	เมื่อทำเสร็จแล้ว ในแต่ละอันค่อย ๆ uncomment แต่ละบรรทัดให้ทำงาน
//      สร้าง object อีกกา
        Crow crow1 = new Crow("crow1");
//	สั่งให้การ้อง
       crow1.sound();
//      สร้าง object กบ
        Frog frog1 = new Frog("frog1");
//	สั่งให้กบร้อง
       frog1.sound(); 
//      สร้าง object นกฮูกก       
        Owl owl1 = new Owl("owl1");
        owl1.sound();
        
      System.out.println("Polymophism..");
//	3. รวบรวมสัตว์ทุกตัวให้เป็นฝูงใน array ประกอบด้วย cat1,dog1,crow1,frog1 และ owl1 uncomment และ ดูผลที่เกิดขึ้น    
     Animal[] animals = {cat1,dog1,crow1,frog1,owl1};
// 	วนลูบตามลำดับสัตว์และสั่งให้สัตว์ร้อง (Polymorphism)
        for(int i=0;i<animals.length;i++) {
           animals[i].sound();
//	กบได้สิทธิพิเศษได้ร้องอีกครั้ง อิอิ
           if(animals[i] instanceof Frog) {
               animals[i].sound();
          }
      }
        
        
    }
    
}
