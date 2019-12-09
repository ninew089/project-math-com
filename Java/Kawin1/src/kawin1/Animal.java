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
public class Animal {
    private int ATK;
    private String name;
    
    public Animal(String name,int ATK){
        this.ATK=ATK;
        this.name=name;
    }
    
    public int GetATK(){
        return ATK;
    }
    
    public void SetATK(int ATK){
        this.ATK=ATK;
    }
    
    public String Getname(){
        return name;
    }
    
    public void Setname(String name){
        this.name=name;
    }
    
    public void attack(){
        System.out.println("Animal Attack "+ATK);
    }
}
