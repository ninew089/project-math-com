/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab10;
import java.util.Arrays;
/**
 *
 * @author apple
 */
public class Main {

 public static void main(String[] args) {
       StudentHashTable s = new StudentHashTable(11);
       Student[] a = {
           new Student(157,"Andrea Sandell"),
           new Student(130,"Michael O. Jackson"),
           new Student(159,"Issac T. Matthews"),
           new Student(295,"John Doe"),
           new Student(215,"John N. Simpson"),
           new Student(111,"Teresa Smith"),
           new Student(212,"John Doe"),
           new Student(229,"Stephen Rogers") 
       };
       s.addAll(a);
       int[] k = {295,141,111,240,130};
       s.checkAll(k);
       s.remove(new Student(130,"Michael O. Jackson"));s.checkAll(k);
       s.add(new Student(141,"Douglas Jackson"));s.checkAll(k);
       
    }
    
}
