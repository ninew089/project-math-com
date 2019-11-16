package pkg6033611623_poker_project;
public class Money {
    private int money = 100;
    private int bet = 1;
    public int getBet(){
        return bet;
    }
    public int getMoney(){
        return money;
    }
    public void setBet(int b){
        bet=b;
    }
     public void setMoney(int money){
        this.money=money;
    }
    public void winPrice(){
        money+=bet;
    }
    public void losePrice(){
        money-=bet;
    }
    public void winPriceS(){
        money+=(bet*3);
    }
    public void winPriceD(){
        money+=(bet*2);
    }
    public void losePriceD(){
        money-=(bet*2);
    }
    public void losePriceS(){
        money-=(bet*3);
    }
     public void winPricej(){
        money+=(bet*5);
    }
    public void losePricej(){
        money-=(bet*5);
}}
