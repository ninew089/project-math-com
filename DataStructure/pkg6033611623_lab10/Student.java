/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab10;

/**
 *
 * @author apple
 */
public class Student implements Hashitem{
    private int size;
    private int id;
    private String name;
    private String lastname;
    public Student(int i,String n){
    id=i;
    name=n;
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
   
    public int getKey() {return id;}
  }
        
    
    

