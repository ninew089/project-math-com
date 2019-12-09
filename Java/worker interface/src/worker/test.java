package worker;
public class test {
    public static void main(String[] args) {
        Worker work[] = new Worker[11];  
        work[0] = new HourWorker("mario",120,20);
        work[0].code();
        work[1] = new HourWorker("aaaaa",120,20);
        work[1].code();
        work[2] = new SalaryWorker("mario",200,50);
        work[2].code();
        work[3] = new SalaryWorker("aaaaa",200,50);
        work[3].code();
        work[4] = new SaleWorker("mario",120,30000);
        work[4].code();
        work[5] = new SaleWorker("aaaaa",120,30000);
        work[5].code();
        
           
    }
    
}
