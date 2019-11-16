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
public class Studentlist {
    Student s[];
    Studentlist(Student s[]){
        this.s=s;
    }
    public int getID(String name){
        int i =0;
        while(i<s.length&&!s[i].getName().equals(name)){i++;}
        if(i==s.length){return -1;}
        return s[i].getID();
    }
    public String getName(int id){
        int low=0, high=s.length-1;
        while(high>=low){
            int mid=(high+low)/2;
            if(s[mid].getID()>id){high=mid-1;}
            else if(s[mid].getID()<id){low=mid+1;}
            else {return s[mid].getName();}   
        }
        return null;
    }
    public void sortAndSetList(){
        int i,j,tmp;
        for(i=0;i<s.length-1;i++){
            while(i>=0&&s[i].getID()>s[i+1].getID()){
                tmp=s[i].getID();
                s[i].setID(s[i+1].getID());
                s[i+1].setID(tmp);
                i--;
            }
        }
    }

    public void importList()throws Exception {
        Scanner f = new Scanner(new File("studentlist.txt"));
        ArrayList<Student> a = new ArrayList<Student>();
        String j[] ;
        while(f.hasNext()){
            String i = f.nextLine();
            j=i.split(" ", 2);//เก็บไว้สองชิ้น id ชื่อ นามสกุล
            a.add(new Student(Integer.parseInt(j[0]),j[1]));
        }
        s=a.toArray(new Student[a.size()]);
    }
    public void print(){
    for(int i=0;i<s.length-1;i++){
        System.out.println(s[i]);
    }
    }
}

    

