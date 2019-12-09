/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

/**
 *
 * @author apple
 */
class Frog extends Animal{
    
    public Frog (String name) {
        super("frog:" + name);
    }
    
    public void sound() {
        System.out.println(name + " sound");
        SoundLib.playSound("./frog.wav");
    }
    
}


