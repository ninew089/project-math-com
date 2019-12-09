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
public class Cat extends Animal {
    
    public Cat(String name) {
        super("cat:" + name);
    }
    
    public void sound() {
        System.out.println(name + " sound");
        SoundLib.playSound("./cat.wav");
    }
}
