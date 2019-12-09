/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawin1;

import java.util.ArrayList;

/**
 *
 * @author Windows10Pro
 */
public class Kawin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> test = new ArrayList<Animal>();
        Animal a = new Animal("bitch",1);
        Cat b = new Cat("dog",2);
        Dog c = new Dog("Aut",999999999);
        Bird d = new Bird("Eagle"/*America Fk yea*/,4);
        test.add(a);
        test.add(b);
        test.add(c);
        test.add(d);
        for(int i=0;i<test.size();i++){
            test.get(i).attack();
            if(test.get(i) instanceof Cat){
                System.out.println("Meow");
            }
        }
    }
    
}
