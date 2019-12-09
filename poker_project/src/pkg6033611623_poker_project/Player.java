package pkg6033611623_poker_project;
public class Player {
    private Card card1,card2,card3;

    Player(Card card1,Card card2){
        this.card1=card1;
        this.card2=card2; 
        this.card3=new Card(0,null);// กำหนดค่า card3 ที่ไม่มี  
    }
    Player(Card card1,Card card2,Card card3){
        this.card1=card1;
        this.card2=card2; 
        this.card3=card3; 
    }
    public int getValue(){
        return (card1.getValue()+card2.getValue()+card3.getValue())%10; //getValue มาจาก class card
    }
    public String toString(){// รีเทริน์ชื่อทั้งหมด
        if (card3.getValue()==0){  //ถ้าcard3==0 คือแสดงว่าไม่มีไพ่
            return card1.toString()+" "+card2.toString(); //มาจากclass card
        }else {
            return card1.toString()+" "+card2.toString()+" "+card3.toString();
        }
    }
}
