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
public class SalaryWorker extends Work {
    private double penalty;
    SalaryWorker(String name,double salary,double penalty){
        super(name,salary);
        this.penalty=penalty;
    }
    @Override
    double weeklyPay(int hours){
       if(hours>=40){
           return super.weeklyPay(40);
       }else{
           return super.weeklyPay(40)-((40-hours)*penalty);
       }
    }
}
