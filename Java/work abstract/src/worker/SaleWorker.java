/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;


public class SaleWorker extends Worker{
   private double target;
   public SaleWorker(String name,double salary,double target){
       super(name,salary);
       this.target=target;
   }
   public double gettarget(){
       return target;
   }
   
 
   public double weeklyPay(int sale){
       
    
       if(sale>=target){
           return super.getsalary()*40+(0.1*sale);
       }
       else{
           return super.getsalary()*40;
       }
   }

   

    
}
