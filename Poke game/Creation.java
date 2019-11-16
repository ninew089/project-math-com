/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_poker_project;

import java.util.ArrayList;

/**
 *
 * @author apple
 *  * 
 * ♣♦♥♠

 */
public class Creation {
    public ArrayList deckSuit(){  //สร้างdeck
    ArrayList<Card> Deck = new ArrayList<>();
    for(int i =1;i<14;i++){ //รันเลขไพ่ 1-13
        Deck.add(new Card(i,"♠"));
        Deck.add(new Card(i,"♥"));
        Deck.add(new Card(i,"♦"));
        Deck.add(new Card(i,"♣"));
        
    } 
    Deck.add(new Card(0,""));
    
    java.util.Collections.shuffle(Deck); //สลับไพ่
    return Deck;
}
    
}
