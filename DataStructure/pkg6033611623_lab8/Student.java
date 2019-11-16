/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab8;

/**
 *
 * @author apple
 */
public class Student {
    private int id;
    private String name;
    private String lastname;
    public Student(int i,String n){
    id=i;
    name=n;
    }
    public int  getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setID(int i){
        id=i;}
    public void setName(String n){
        name=n;}
    public String toString(){
       return"("+id+","+name+")";
            }
  }
        
    
    

