/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author apple
 */
public class Work {
    private String name;
    private double salary;
    Work(String name,double salary){
        this.name=name;
        this.salary=salary;    
    }
    String getName(){
        return name;
    }
    double weeklyPay(int hours){
      return hours*salary;  
    }

    double weeklyPay(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
