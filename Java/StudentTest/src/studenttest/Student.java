/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

/**
 *
 * @author apple
 */
public class Student {
    private String name;
    private int id;
    Student(int id,String name){
        this.name=name;
        this.id=id;
    }
    Student(){
        id=0;
        name=null;
        
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    void setid(int id){
        this.id=id;
    }
    void setname(String name){
        this.name=name;
    }
    
}
