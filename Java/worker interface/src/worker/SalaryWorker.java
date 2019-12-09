package worker;
class SalaryWorker extends Worker implements Game{
private double penalty;
SalaryWorker(String name, double salary,double penalty){
    super(name,salary);
            this.penalty=penalty;
}
public double weeklyPay(int hours){
    if(hours<40){return 40*getSalary()-(40-hours)*penalty;}
    else{return 40*getSalary();}
}
public double weeklyPay(int hours,int i){
    if(hours<40){return 40*getSalary()-(40-hours)*penalty;}
    else{return 40*getSalary();}
}
public void code(){
    int sum = 1;
   for(int i=0;i<getName().length();i++){sum *=(getName().charAt(i)-'a'+1);}
    System.out.println(sum);
}
}
