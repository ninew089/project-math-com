/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> stu=new ArrayList<>();
        Student s;
        stu.add(new Student(100,"Somchai"));
        stu.add(new Student(101,"Somlove"));
        stu.add(new Student(102,"Somsri"));
        for(int i=0;i<stu.size();i++){
            s=stu.get(i);
            System.out.println(s.getId()+" "+s.getName());
        }
        stu.add(2,new Student(103,"Somking"));
         System.out.println("0");
         for(int i=0;i<stu.size();i++){
            s=stu.get(i);
            System.out.println(s.getId()+" "+s.getName());
        }
        s=new Student(99,"Somvish");
        stu.set(1,s);
        System.out.println("1");
         for(int i=0;i<stu.size();i++){
            s=stu.get(i);
            System.out.println(s.getId()+" "+s.getName());
        }
        stu.remove(3);
        System.out.println("2");
        for(int i=0;i<stu.size();i++){
            s=stu.get(i);
            System.out.println(s.getId()+" "+s.getName());
        }
    }
    
}
