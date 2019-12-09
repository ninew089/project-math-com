/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author WeerisTreeratanajaru
 */
public abstract class Worker {
    private String name;
    private double salary;
    public Worker(String name,double salary){
        this.name=name;
        this.salary=salary;

    }   
    public String getName(){
        return name;
    }
    public  double getsalary(){
        return salary;
    }
    public abstract double weeklyPay(int hours);
        
    
    

   

   
}

