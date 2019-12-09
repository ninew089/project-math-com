/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawin1;

/**
 *
 * @author Windows10Pro
 */
public class Dog extends Animal{

    public Dog(String name, int ATK) {
        super(name,ATK);
    }
    
    @Override
    public void attack(){
        System.out.println(Getname()+" Bite "+GetATK());
        //System.out.println("Scratch "+super.GetATK());
    }
    
}
