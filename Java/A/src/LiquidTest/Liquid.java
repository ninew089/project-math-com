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
public class Liquid {
    double volume;

  // ของเหลวเริ่มต้นมีปริมาตร 0 ลิตร
  public Liquid() {
    volume = 0;
  }

  // กำหนดปริมาตรของเหลวเริ่มต้นตามค่าที่กำหนด
  // @param initialVolume คือปริมาตรของเหลวเริ่มแรก
  public Liquid(double initialVolume) {
    volume = initialVolume;
  }

  // เติมน้ำเพิ่มทำให้ของเหลวมีปริมาตรเพิ่ม
  // @param amnt คือปริมาณน้ำที่เติม
  public void add(double amnt) {
    volume = volume + amnt;
  }

  // เอาของเหลวออกทำให้ปริมาตรของเหลวลดลง
  // @param amnt คือปริมาณน้ำที่เอาออก
  public void remove(double amnt) {
    volume = volume - amnt;
  }
  
  // คืนค่าปริมาณของของเหลว
  // @return ปริมาณของเหลว
  public double getVolume() {
    return volume;
  }  
  
  //ถ่ายโอนของเหลวไปยังของเหลวชนิดอื่น
  public void transfer(double amnt, Liquid other) {
	remove(amnt);
	other.add(amnt);
  }

}
