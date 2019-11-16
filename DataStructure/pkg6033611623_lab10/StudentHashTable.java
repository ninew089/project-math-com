/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab10;

/**
 *
 * @author apple
 */
public class StudentHashTable implements Hashtable{
    Student e[];
    int size;
    Student slist[];
    StudentHashTable(int i){
        size=i;
        slist=new Student[i];
    }
    public void add(Student s) {
        int key=s.getKey()%slist.length;
        while(slist[key]!=null&&slist[key]!=new Student(0,null)){key=(key+1)%slist.length;}
        slist[key]=s;
    }

    public void remove(Student s) {
        int id=s.getKey();
        int key = s.getKey()%slist.length;
        while(slist[key]!=null&&slist[key].getKey()!=id){key=(key+1)%slist.length;}
        if(slist[key%slist.length]!=null&&slist[key%slist.length].getKey()==id){slist[key%slist.length]=new Student(0,null);}
        
    }
    public boolean contains(Student s) {
        int id=s.getKey();
        int key = s.getKey()%slist.length;
        while(slist[key]!=null&&slist[key].getKey()!=id){key=(key+1)%slist.length;}
        if(slist[key%slist.length]!=null&&slist[key%slist.length].getKey()==id){return true;}
        else{return false;}
    }

    public Student get(int i) {
        int id=i;
        int key = i%slist.length;
        while(slist[key]!=null&&slist[key].getKey()!=id){key=(key+1)%slist.length;}
        if(slist[key%slist.length]!=null&&slist[key%slist.length].getKey()==id){return slist[key%slist.length];}
        else{return null;}
    }
    public void addAll(Student[] s){
        for(int i=0;i<s.length;i++){this.add(s[i]);}
    }
    public void checkAll(int[] keytsu){
        for(int i=0;i<keytsu.length;i++){
            Student a=this.get(keytsu[i]);
            if(a==null){System.out.println("Not Found");}
            else{System.out.println(a);}
        }
        System.out.println("________________________________________");
    }
}
    

