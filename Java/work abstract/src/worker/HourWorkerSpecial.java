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
public class HourWorkerSpecial extends HourWorker{
private double exp;    

    public HourWorkerSpecial(String name, double salary, double bonus,double exp) {
        super(name, salary, bonus);
        this.exp=exp;
    }
@Override
    public double weeklyPay(int hours){
        
        if(exp>=7){
            return super.weeklyPay(hours)+3000;
        }
        else if(exp>=5 && exp<7){
            return super.weeklyPay(hours)+2000;
        }
        else {
            return super.weeklyPay(hours)+1000;
        }
    
    }
}
