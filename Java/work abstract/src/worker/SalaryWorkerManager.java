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
public class SalaryWorkerManager extends SalaryWorker{
private boolean degree;

    public SalaryWorkerManager(String name, double salary, double penalty,boolean degree) {
        super(name, salary, penalty);
        this.degree=degree;
    }
    public double weeklyPay(int hours){
        
    
        if(degree==true){
            return super.weeklyPay(hours)+2000;
        }
        else{
            return super.weeklyPay(hours)+500;
        }
    }
}
