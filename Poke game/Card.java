package pkg6033611623_poker_project;


public class Card {
    private int value,getv;
    private String rank;
    Card(int i,String r){   //เก็บการ์ด เป็นค่าเลข i กับ rank
        value = i;  
        rank = r; 
        if(i>10){  //ถ้า i มากกว่า สิบ จะได้ค่า 10 พวก jqk
            getv=10;
        }else{ 
            getv=i;} // ตัวอื่นคืนค่าเท่าเดิม
    }
    public int getValue(){
        return getv; // ใช้สำหรับคืนค่า
    }
    public String toString(){
                //  สำหรับเรียกไพ่ออกมาเป็นstr 
       if(value==11){
           return "J"+"  "+rank;
           
       }else if(value==12){
            return "Q"+"  "+rank;
       }else if(value==13){
            return "K"+"  "+rank;
       }else if(value==1){
            return "A"+"  "+rank;
        }else if(value==0){
            
            return "rJoker"+"  ";
       }else{
            return value+"  "+rank;
        }
}
}
