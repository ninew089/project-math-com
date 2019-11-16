package lab9_6033643723;
import java.io.FileNotFoundException;
import java.util.*;
public class Lab9_6033643723 {
    public static void main(String[] args) {
       Student[] a = {
           new Student(157,"Andrea Sandell",78),
           new Student(130,"Michael O. Jackson",78),
           new Student(159,"Issac T. Matthews",55),
           new Student(295,"John Doe",86),
           new Student(215,"John N. Simpson",40),
           new Student(111,"Teresa Smith",81)
       };
       ScoreList s = new ScoreList(a);
       s.sortByID();
       System.out.println(Arrays.toString(s.s));
       System.out.println("____________________________________________");
       s.printHighScore(6);
       System.out.println("____________________________________________");
       ScoreList u = new ScoreList(a);
       try {u.importList();}
       catch(FileNotFoundException e){System.out.println("Nope");}
       u.sortByID();
       u.printHighScore(100);
       System.out.println("____________________________________________");
    }
}
