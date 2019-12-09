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
public class SaleWorker extends Work{
    private double target;
    SaleWorker(String name,double salary,double target){
        super(name,salary);
        this.target=target;        
        
    }
    @Override
    double weeklyPay(int sales){
        if(sales>=target){
         return super.weeklyPay(40)+(target*10/100);
        }else{
         return super.weeklyPay(40);
        } 
}
}
