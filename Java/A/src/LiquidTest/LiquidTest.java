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
public class LiquidTest {
    
    public static void main(String[] args) {
    TeaDrink myDrink = new TeaDrink(10);
    CacoaDrink yourDrink = new CacoaDrink(0.5);

    myDrink.add(2);
    
    myDrink.transfer(1, yourDrink);
    yourDrink.remove(0.1);
    yourDrink.remove(0.3);

    myDrink.transfer(0.2, yourDrink);
    yourDrink.remove(0.1);
    
    myDrink.addSyrup(); //เติมน้ำเชื่อม 
    yourDrink.diluteDrink(10); //เจือจางเครื่องดื่มลง 10 %

    System.out.println("My drink volume: " + myDrink.getVolume());
    System.out.println("Expected: 0.88 liter");

    System.out.println("Your drink volume: "+ yourDrink.getVolume());
    System.out.println("Expected: 1.32 liter");
  }
}
