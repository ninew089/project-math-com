/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab9;

/**
 *
 * @author apple
 */
public class Student {
    private String name;
    int score;
    int id;
    public Student(int i,String n,int s){
        id=i;
            
        name=n;
  
        score=s;
    }
    public String getName(){
    return "name: "+name+" ";
    } 
    public int getId(){
        
    return id;
    }
    public void setName(String n){
    name=n;
    }
    public void setId(int i){
    id=i;
    }
    public void setScore(int s){
    score=s;
    }
    public int getScore(){
    return score;
    }
    public String toString(){
    return "id: "+id+" "+"name"+name+" score:"+score;
    }
}
