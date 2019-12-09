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
public class SalaryWorker extends Worker{
private double penalty;

    public SalaryWorker(String name, double salary,double penalty) {
        super(name, salary);
        this.penalty=penalty;
    }
@Override
    public double weeklyPay(int hours){
        
    
        if(hours>=40){
            return super.getsalary()*40;
        }
        else{
            return super.getsalary()*40-((40-hours)*penalty);
        }
    }
    
}
