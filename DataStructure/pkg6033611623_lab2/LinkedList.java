/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab2;

/**
 *
 * @author apple
 */
public class LinkedList implements List{
    private MyNode first;
    private int size;
    public LinkedList(){
        first=null;
        size=0;
    }
    public boolean isEmpty() {
        return first==null;
    }
    public int size(){
        return size;
    }
    public void add(Object e){
        if(isEmpty()) first= new MyNode(e,first);
        else{
            MyNode start= first;
            while(start.getNext()!=null)
            start=start.getNext(); 
            MyNode tmp=new MyNode(e,start.getNext());
            start.SetNext(tmp);    
    }
        size++;
        
    }

    public void remove(Object e) {
         if(isEmpty()) return;
        MyNode pre = null;
        MyNode start=first;
        while(start.getNext()!=null && !(start.getData().equals(e)))
        {
         pre =start;
         start=start.getNext();
        }
        if(!(start.getData().equals(e))) System.out.println("Not found");
        else{
            if(start==first)
                first =first.getNext();
            else
                pre.SetNext(start.getNext());
            size--;
            
        }
        }

    public void add(int i, Object e) {
        if (i>=0 && i<=size-1){
                if(i==0)   first=new MyNode(e,first);  
                else{
                    MyNode pre=null,start=first;
                    for(int j=1;j<=i;j++){
                        pre=start;
                        start=start.getNext(); }
                    MyNode tmp=new MyNode(e,start);
                    pre.SetNext(tmp);
                }
                    
            size++;
            
        }
        
    }

   
    public boolean contain(Object e) {
        MyNode start=first;
        while(start.getNext()!=null && !(start.getData().equals(e)))
        {start=start.getNext();}
        return start != null;
    }

   
    public void remove(int i) {
       if(i>=0 && i<=size-1)
       {if(i==0) first=first.getNext();
       else{
           MyNode pre = null,start=first;
           for(int j=1;j<=i;j++)
           {pre=start;
           start=start.getNext();
           }
           pre.SetNext(start.getNext());
       }
       size--;
       }
           
    }
    
    public Object get(int i) {
        if(i>=0 && i<=size-1){
           MyNode start=first;
           for(int j=1;j<=i;j++){
               start=start.getNext();
           }
           return start.getData();
    }
        else
            return null;
    }


    public void set(int i, Object e) {
       if(i>0 && i<=size-1){
           MyNode start=first;
           for(int j=1;j<=i;j++){
               start=start.getNext();
           }
           start.setData(e);
       }
    }
    public void printL(){
        MyNode start=first;
        while(start!=null){
            System.out.println(start.getData());
        start=start.getNext();}
    }
    
    
    
}
    
    
          
       
    


    
    

