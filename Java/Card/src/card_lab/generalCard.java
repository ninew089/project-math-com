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
class generalCard extends Card {

    private int discount;

    generalCard(String name, int age,String idNum) {
        super(name, age,idNum);
   
    }

 

    @Override
    public int getDiscount(String day) {
        discount=20;
        return discount;
    }

    @Override
    public void Promotion() {
        System.out.println(name+"wiil get discount "+20+" bath");
}
}
