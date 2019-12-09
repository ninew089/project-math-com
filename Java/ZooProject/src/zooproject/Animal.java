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
public class Animal {
    protected String name;
    public Animal(String name) {
        this.name=name;
    }
    public void sound() {
        System.out.println("...");
    }
}
