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
public class SaleWorkerManager extends SaleWorker{
    
    public SaleWorkerManager(String name,double salary,double target){
   super(name,salary,target);
}

    
    
     public double weeklyPay(int sale, int newproduct){
         
    
        return super.weeklyPay(sale)+2000*newproduct;
     }
    
            
    
       
}

