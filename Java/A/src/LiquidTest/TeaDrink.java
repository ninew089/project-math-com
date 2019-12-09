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
public class TeaDrink extends Liquid {

  private double syrupPercent;  //เปอร์เซ็นต์ปริมาณน้ำเชื่อม

  // กำหนดเปอร์เซ็นปริมาณน้ำเชื่อมที่จะเติมลงในชา 
  // @param pc คือ เปอร์เซ็นต์ปริมาณน้ำเชื่อม
  // จงเขียน contructor โดยกำหนดค่าตัวแปร syrupPercent ให้เท่ากับ pc 
  public TeaDrink(double pc) {
      this.syrupPercent = pc;
  }

  // เติมน้ำเชื่อม 
  // จงเติม method นี้โดยปริมาณน้ำเชื่อมคิดเป็น xxx% จากปริมาณของเหลว (volume) 
  // เช่น หาก volume มีค่าเป็น 1 และ syrupPercent มีค่าเป็น 10  ปริมาณน้ำเชื่อมที่จะเติมคือ 1 * 10/100 = 0.1 ลิตร 
  // หลังจากเรียก method นี้  volume จะกลายเป็น 1.1 ลิตร
  public void addSyrup() {
      volume += super.getVolume()*syrupPercent/100;

  }
}
