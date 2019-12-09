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
import java.util.ArrayList;
public class MovieCardTester {
 public static void main(String[] args) {
 ArrayList<Card> a = new ArrayList<>();
 Card c = new generalCard("May Parker",57,"001");
 a.add(c);
 c = new studentCard("Peter Parker",15,"002");
 a.add(c);
 c = new studentCard("Steve Rogers",94,"003");
 a.add(c);
 c = new VIPCard("Tony Stark",57,"004");
 a.add(c);

 String day = "Wed";
 System.out.println(a.get(0).toString());
 a.get(0).Promotion();
 a.get(0).addMovieList("Spider man "+day+" 6:00PM");
 System.out.println(a.get(0).getName()+" Prize is "+(120-a.get(0).getDiscount(day)));
 System.out.println(a.get(1).toString());
 a.get(1).Promotion();
 a.get(1).addMovieList("Spider man "+day+" 6:00PM");
 System.out.println(a.get(1).getName()+" Prize is "+(120-a.get(1).getDiscount(day)));
 System.out.println(a.get(2).toString());
 a.get(2).Promotion();
 a.get(2).addMovieList("Captain america "+day+" 10:00AM");
 System.out.println(a.get(2).getName()+" Prize is "+(120-a.get(2).getDiscount(day)));
 System.out.println(a.get(3).toString());
 a.get(3).Promotion();
 a.get(3).addMovieList("Iron man "+day+" 2:00PM");
 System.out.println(a.get(3).getName()+" Prize is "+(120-a.get(3).getDiscount(day)));

 day="Thu";
 a.get(2).addMovieList("Civil war "+day+" 10:00AM");
 System.out.println(a.get(2).getName()+" Prize is "+(120-a.get(2).getDiscount(day)));
 System.out.println(a.get(3).toString());
 a.get(3).Promotion();
 a.get(3).addMovieList("Civil war "+day+" 10:00AM");
 System.out.println(a.get(3).getName()+" Prize is "+(120-a.get(3).getDiscount(day)));

 a.get(2).printMovieList();
 a.get(3).printMovieList();
 }
}