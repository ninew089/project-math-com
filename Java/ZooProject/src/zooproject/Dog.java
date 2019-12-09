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
public class Dog extends Animal {
    
    public Dog(String name) {
        super("dog:" + name);
    }
    
    public void sound() {
        System.out.println(name + " sound");
        SoundLib.playSound("./dog.wav");
    }
}
