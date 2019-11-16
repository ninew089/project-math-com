/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab9;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  
        // TODO code application logic here
       public static void main(String[] args) {
       Student[] a = {
           new Student(157,"Andrea Sandell",78),
           new Student(130,"Michael O. Jackson",78),
           new Student(159,"Issac T. Matthews",55),
           new Student(295,"John Doe",86),
           new Student(215,"John N. Simpson",40),
           new Student(111,"Teresa Smith",81)
       };
       Scorelist s = new Scorelist(a);
       s.sortByID();
       System.out.println(Arrays.toString(s.s));
       System.out.println("____________________________________________");
       s.printHighScore(6);
       System.out.println("____________________________________________");
       Scorelist u = new Scorelist(a);
       try {u.importList();}
       catch(FileNotFoundException e){System.out.println("Nope");}
       u.sortByID();
       u.printHighScore(100);
       System.out.println("____________________________________________");
    }
}

    

