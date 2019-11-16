/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab3;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkList a=new LinkList();
        a.add(20);
        a.printList();
        a.add(30);
        a.printList();
        a.add(15);
        a.add(25);
        a.add(30);
        a.add(40);
        a.printList();
        System.out.println(a.contain(30));
        System.out.println(a.contain(28));
        a.remove(15);
        a.printList();
        a.remove(25);
        a.printList();
        a.remove(40);
        a.printList();
        a.remove(35);
        a.printList();
       
      
    }
    
}
