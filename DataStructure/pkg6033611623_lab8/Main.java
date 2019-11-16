/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab8;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student a[]= {new Student(10,"A"),new Student(12,"B"),new Student(15,"D"),new Student(19,"E")};
       Studentlist s = new Studentlist(a);
       System.out.println(s.getID("C"));
       System.out.println(s.getID("E"));
       System.out.println(s.getName(10));
       System.out.println(s.getName(16));
       Student b[] = {
            new Student(157, "Andrea Sandell"), 
            new Student(130, "Michael O. Jackson"), 
            new Student(159, "Issac T. Matthews"), 
            new Student(295, "John Doe"),
            new Student(215, "John N. Simpson"),
            new Student(111, "Teresa Smith")
        };
       Studentlist t = new Studentlist(b);
       t.sortAndSetList();
       System.out.println(t.getID("John Doe"));
       System.out.println(t.getID("Timothy E. Andrews"));
       System.out.println(t.getName(295));
       System.out.println(t.getName(296));
       Studentlist u = new Studentlist(a);
       try {u.importList();}
       catch(Exception e){System.out.println("NOPE");}
       System.out.println(u.getID("John Doe"));
       System.out.println(u.getID("Timothy E. Andrews"));
       System.out.println(u.getName(1054641271));
       System.out.println(u.getName(1395664271));
    }
    }
    

