/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_lab;

import java.util.ArrayList;

/**
 *
 * @author student
 */
abstract class Card {
    protected String name;
    protected int age;
    protected String idNum;
    ArrayList a = new ArrayList();
    Card(String name,int age,String idNum){
        this.name=name;
        this.age=age;
        this.idNum=idNum;
    }
    public String toString(){
        return name+" "+age+" "+idNum; 
    }
    public String getName(){
        return name;
    }
public int getAge(){
    return age;
}
public String getID(){
return idNum;
}
public void setName(String name) {
this.name=name;
}
public void setAge(int age) {
this.age=age;
}
public void printMovieList(){
System.out.println(a);
}
public void addMovieList(String a) {
     this.a.add(a);
    
}
public abstract int getDiscount(String day);
public abstract void Promotion();
    
}
