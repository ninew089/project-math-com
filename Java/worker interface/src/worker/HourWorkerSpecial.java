package worker;
public class HourWorkerSpecial extends HourWorker{
    private double exp;
    HourWorkerSpecial(String name, double salary, double bonus, double exp){
        super(name, salary, bonus);
        this.exp=exp;
    }
    public double weeklyPay(int hours){
        if (exp>=7) {return super.weeklyPay(hours)+3000;}
        else if (exp>=5){return super.weeklyPay(hours)+2000;}
        else {return super.weeklyPay(hours)+1000;}
        }
}

