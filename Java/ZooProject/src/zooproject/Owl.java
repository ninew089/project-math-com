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
class Owl extends Animal {
    public Owl(String name) {
        super("owl:" + name);
    }
    
    public void sound() {
        System.out.println(name + " sound");
        SoundLib.playSound("./owl.wav");
    }
    
}
