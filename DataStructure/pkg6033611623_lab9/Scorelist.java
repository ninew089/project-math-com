/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author apple
 */
public class Scorelist {
    Student s[];
    public Scorelist(Student s[]){
    this.s=s;
    }
     
//quick sort
     public void sortByID(){quickSort(s,0,s.length-1);}
     public void quickSort(Student s[],int low,int hight){
         if(low<hight){
         int pi=partition(s,low,hight);
         quickSort(s,low,pi-1);
         quickSort(s,pi+1,hight);
         }
         
     
     
     }
     public int partition(Student s[],int low,int hight){
     int pivot=s[hight].getId();
     int i=(low-1);
     for (int j=low;j<hight;j++){
         if(s[j].getId()<pivot){
         i++;
         int temp =s[i].getId();
         s[i].setId(s[j].getId());
         s[j].setId(temp);
         
         }
     }
     int temp=s[i+1].getId();
     s[i+1].setId(s[hight].getId());
     s[hight].setId(temp);
     return i+1;
     }
     
//merge sort
     public void printHighScore(int m){
        MergeSort(s);
        for(int i=0;i<s.length-1;i++){
            while(i>=0&&s[i].score==s[i+1].score&&s[i].id>s[i+1].id){
                Student t = s[i];
                        s[i]=s[i+1];
                        s[i+1]=t;
                        i--;
            }
        }
        for(int i=0;i<m;i++){System.out.println(s[i]);}
    }
    public void MergeSort(Student[] s){
        if(s.length==1)return;
        Student[] l = new Student[s.length/2];
        Student[] r = new Student[s.length-s.length/2];
        for(int i=0;i<l.length;i++){l[i]=s[i];}
        for(int i=0;i<r.length;i++){r[i]=s[i+l.length];}
        MergeSort(l);
        MergeSort(r);
        Merge(s,l,r);
    }
    public void Merge(Student[] s,Student[] l,Student[] r){
        int i=0,j=0;
        while(i+j<l.length+r.length){
            if(j==r.length||(i<l.length&&l[i].score>r[j].score)){
             s[i+j]=l[i];
             i++;
            }
            else {s[i+j]=r[j];j++;}
        }
    }
    public void importList() throws FileNotFoundException{
        Scanner f = new Scanner(new FileReader("student_score.txt"));
        ArrayList<Student> a = new ArrayList<Student>();
        while(f.hasNext()){
            String[] t = f.nextLine().split(" ");
            int id = Integer.parseInt(t[0]);
            int score = Integer.parseInt(t[t.length-1]);
            String name="";
            for(int i =1;i<t.length-1;i++){name= name+t[i]+" ";}
            name=name.trim();
            a.add(new Student(id,name,score));
        }
        s=a.toArray(new Student[a.size()]);
    }
}
