/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab6;

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
        BinarySearchTree bs=new BinarySearchTree();
        Integer a=new Integer(9);
        Integer b=new Integer(2);
        Integer c=new Integer(12);
        Integer d=new Integer(1);
        Integer e=new Integer(5);
        Integer f=new Integer(10);
        Integer g=new Integer(15);
        Integer h=new Integer(20);
        bs.add(a);
        bs.add(b);
        bs.add(c);
        bs.add(d);
        bs.add(e);
        bs.add(f);
        bs.add(g);
        bs.remove(e);
        bs.printTree();
        System.out.println("Nnode"+bs.nnode());
        System.out.println("Min: "+bs.getMin());
        System.out.println("Max: "+bs.getMax());
        System.out.println("is "+c+" in the tree"+"\t"+bs.contain(c));
        System.out.println("is "+h+" in the tree"+"\t"+bs.contain(h));
    }
    
}
