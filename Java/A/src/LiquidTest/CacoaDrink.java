/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiquidTest;

/**
 *
 * @author student
 */
public class CacoaDrink extends Liquid {

    private static final double POWDER = 3; //ปริมาณผงโกโก้ หน่วยเป็นกรัม
    private double concentration; //ความเข้มข้นของสารละลาย หน่วยเป็น กรัมต่อลิตร (grams per liter)

    // กำหนดปริมาตรตั้งต้นของของเหลว  
    // @param initialVolume คือ ปริมาตรตั้งต้นหน่วยเป็นลิตร
    // จงเขียน contructor โดยกำหนดค่าตัวแปร volume ให้เท่ากับ initialVolume และคำนวณ concentration จากสูตร จำนวนกรัมของผงโกโก้/ปริมาตรของเหลวหน่วยเป็นลิตร
    public CacoaDrink(double initialVolume) {
         volume = initialVolume;
    }

    // เติมน้ำเพิ่มทำให้ของเหลวมีปริมาตรเพิ่ม
    // @param amnt คือปริมาณน้ำที่เติม
    // จงเติม method นี้โดยเมื่อเติมน้ำปริมาตรของเหลวจะเพิ่มขึ้น
    // เช่นเดิมหาก volume เป็น 1 และ amnt เป็น 0.5
    // หลังจากเรียก method นี้  volume จะกลายเป็น 1.5
    // จากนั้นคำนวณค่าความเข้มข้นใหม่
    public void add(double amnt) {
        volume = volume+amnt;
        concentration = POWDER/volume;
    }

    // เอาของเหลวออกทำให้ปริมาตรของเหลวลดลง
    // @param amnt คือปริมาณน้ำที่เอาออก
    // จงเติม method นี้โดยเมื่อเอาน้ำออกโดยทำให้ระเหย ปริมาตรของเหลวจะลดลง
    // เช่นเดิมหาก volume เป็น 1 และ amnt เป็น 0.5
    // หลังจากเรียก method นี้  volume จะกลายเป็น 0.5
    // จากนั้นคำนวณค่าความเข้มข้นใหม่
    public void remove(double amnt) {
        volume = volume-amnt;
        concentration = POWDER/volume;
    }

    // ทำให้เครื่องดื่มโกโก้เข้มข้นน้อยลง
    // จงเติม method นี้โดยจะทำให้เครื่องดื่มเข้มข้นน้อยลงถ้าหากว่า concentration มากกว่า 2 g/L 
    // โดยจะเติมน้ำปริมาตร xxx % ของ volume ปัจจุบัน โดย xxx คือค่าที่เก็บในตัวแปร dilutePercent ที่รับเข้ามา
    // เช่นหาก volume เป็น 1 ลิตร และ dilutePercent เป็น 10 ปริมาณน้ำที่จะเติมคือ 1 * (10/100)  = 0.1 ลิตร
    // เมื่อเติมน้ำจะทำให้ปริมาตรทั้งหมดเพิ่มขึ้น
    // จากนั้นคำนวณความเข้มข้นใหม่
    public void diluteDrink(double dilutePercent) {
        if (concentration >2){
            super.volume += super.getVolume()*(dilutePercent/100);
            concentration = POWDER/volume;
        }
    }
}
