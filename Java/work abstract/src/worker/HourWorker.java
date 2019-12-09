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
public class HourWorker extends Worker{
private double bonus;
public HourWorker(String name, double salary, double bonus){
    super(name,salary);
    this.bonus=bonus;
        
}
@Override
public double weeklyPay(int hours){
    
    if(hours<=40){
        return super.getsalary()*hours;
    }
    else{
        return super.getsalary()*hours+bonus*(hours-40);
    }
}
}
