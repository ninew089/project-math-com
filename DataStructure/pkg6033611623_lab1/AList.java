/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab1;

/**
 *
 * @author apple
 */
public class AList implements List {
    private Object[] data;
    private int size;
    AList(){
        data = new Object[10]; size=0;
    }
    public boolean isEmpty(){return size==0;}
    public boolean contain(Object e){
        return indexOf(e)!=-1;
    }
    public int indexOf(Object e){for(int i=0;i<size;i++){
        if (e.equals(data[i])) return i;}
    return -1;
    }
    public int size(){
        return size;
    }
    public Object get(int i){
        return data[i];
    }
    public void set(int i,Object e){
        data[i]=e;
    }
    public void add(Object e){
        data[size]=e;size++;
    }
    public void add(int i,Object e){
        if(i>=0&&i<size){
            for(int j=size;j>i;j--){ data[j]=data[j-1];}
            data[i]=e;
            size++;
        }
       
    }
    public void remove(Object e){
        if (contain(e)){
            for(int i=indexOf(e);i<size;i++){data[i]=data[i+1];}
            data[size-1]=null;
            size--;
        }

    }
    public void remove(int i){
        if(i>=0&&i<size){
            for(int a=i;a<size;a++){data[a]=data[a+1];}
            data[size-1]=null;
            size--;
        }
      
    }
    public void printList(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]);
            if(i!=size-1){System.out.print(", ");}
            else{System.out.print("\n");}
    }
} 
}