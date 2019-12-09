/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class BusTest {
    public static void main(String[] args) {
        CNGBus Cbus1 = new CNGBus(50,1,200,2);
        Hybrid Hbus1 = new Hybrid(45,1.2,600,150,1);
        ArrayList<Bus> arr = new ArrayList<Bus>();
        arr.add(Cbus1);
        arr.add(Hbus1);
        for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i).getID());
        System.out.println(((LiquidFuel)arr.get(i)).getEmissionTier());
        System.out.println(arr.get(i).getAccel());
        }
    
}
}
