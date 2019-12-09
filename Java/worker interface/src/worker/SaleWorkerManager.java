package worker;
public class SaleWorkerManager extends SaleWorker{
    SaleWorkerManager(String name, double salary, double target){
        super(name,salary,target);
    }
    public double weeklyPay(int sale, int newproduct){
        return super.weeklyPay(sale)+2000*newproduct;}
    }
            
