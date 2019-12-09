package worker;
class SaleWorker extends Worker implements Game{
   private double target;
    SaleWorker(String name, double salary,double target){
        super(name,salary);
        this.target=target;
    }
    public double weeklyPay(int sale){
        if (sale >=target){return 40*getSalary()+sale*0.1;}
        else{return 40*super.getSalary();}
    } 
        public double weeklyPay(int sale,int i){
        if (sale >=target){return 40*getSalary()+sale*0.1;}
        else{return 40*super.getSalary();}
}
        public void code(){
            int sum = 0;
            for(int i=0;i<getName().length();i++){sum += getName().charAt(i)-'a'+1;}
            System.out.println(sum*sum);
        }
}