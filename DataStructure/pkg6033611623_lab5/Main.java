/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab5;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        CirLink a=new CirLink();
        a.add((Object)20);
        a.add((Object)30);

        a.add(0, 70);
        //a.printlist();
         System.out.println( "..............");
       
          
        a.add(2, 90);
         a.printlist();
         System.out.println( "..............");
         a.remove((Object)20);
         a.printlist();
        
          System.out.println( "..............");
      System.out.println(a.size());
       System.out.println( "..............");
        
        System.out.println(a.contains(30));
        System.out.println(a.get(2));
   
    System.out.println( "..............");
      
       a.set(0, 100);
       a.printlist();
       System.out.println( "..............");
       a.set(2, 200);
       
        a.printlist();
        a.remove((Object)50);
        System.out.println( "..............");
      
        System.out.println(a.contains(20));
       a.printlist();
       System.out.println("invoke remove 0");
      a.remove(0);
      a.printlist();
       a.remove(2);

     
        
 
    }
    
}
