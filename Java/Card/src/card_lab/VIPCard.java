/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_lab;

/**
 *
 * @author student
 */
class VIPCard extends Card {

    private int discount;

    public VIPCard(String name, int age,String idNum) {
        super( name,  age,idNum);
    }

    @Override
    public int getDiscount(String day) {
        if(day.equals("Wed")){
             discount=80;
         return discount;
         }else{
              discount=20;
         return discount;
    }
    }

    @Override
    public void Promotion() {
        System.out.println(name+"wiil get discount "+80+"bath on Wednesday and 20 baths on other day");
        
    }
        
    
}
