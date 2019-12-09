package worker;
class HourWorker extends Worker implements Game{
private double bonus;
HourWorker(String name,double salary,double bonus){
    super(name,salary);
    this.bonus=bonus;
}
public double weeklyPay(int hours){
    if(hours<=40){return hours*getSalary();}
    else {return hours*getSalary()+ (hours-40)*bonus;}
}
public double weeklyPay(int hours,int i){
    if(hours<=40){return hours*getSalary();}
    else {return hours*getSalary()+ (hours-40)*bonus;}}
public void code(){
    int sum=0;
    for(int i=0;i<getName().length();i++){
        sum += getName().charAt(i)-'a'+1;}
    System.out.println(sum);
}
}
