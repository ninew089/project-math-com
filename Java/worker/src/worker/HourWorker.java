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
public class HourWorker extends Work {
    private double bonus;
    HourWorker(String name,double salary,double bonus){
        super(name,salary);
        this.bonus=bonus;
        
    }
    @Override
    double weeklyPay(int hours){
       if(hours>40){
           return super.weeklyPay(hours)+(bonus*(hours-40));
       }else{
           return super.weeklyPay(hours);
       }
    
}
    
}
