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
public class SaleWorkerManager extends SaleWorker{
    SaleWorkerManager(String name, double salary, double target){
        super(name,salary,target);
    }
    @Override
    double weeklyPay(int sale, int newproduct){
        return super.weeklyPay(sale)+2000*newproduct;}
    }
           