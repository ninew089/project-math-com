/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab5;

/**
 *
 * @author apple
 */
public class CirLink implements List {
    private MyNode last;
    private int size;
    public CirLink(){last=null; size=0;}
   

    public void add(Object e) {
        MyNode t= new MyNode (e,null);
        if(last==null){last=t; last.setNext(last);}
        else{
            t.setNext(last.getNext());
            last.setNext(t);
            last=last.getNext();
            
        }
        size++;
    }
    public void addEnd(Object e){
    MyNode t=new MyNode(e,null);
       if(last==null){last=t; last.setNext(last);}
       else{
           
           last.setNext(t);
           last=t;
           last.setNext(last.getNext());;
       }
       size++;
    }

    public void remove(Object e) {
        if(isEmpty())return;
        MyNode start = last;
        MyNode pre = start;
       start=start.getNext();
        do{
        pre=start;
        start=start.getNext();
        }
        while(start!=last&&!(start.getData().equals(e)));
        
        if(!contains(e)){
            System.out.println("Not found");
        }else{
            if(pre==start){
                last=null;
            }else{
                
                if(start==last)
                {last=pre;}
                 
                    pre.setNext(start.getNext());
                    
                
                      
            }
            size--;
        }

    }

    public boolean contains(Object e) {
        MyNode start;
        if(last==null) return false;
        else{
            start=last;
            do{
                start=start.getNext();
            }
            while(start!=last&&!(start.getData().equals(e)));
            return start.getData().equals(e);
        }
    }

   
    public boolean isEmpty() {
        return last==null;
    }
    public int size() {
      return size;  
    }
    public void printlist(){
    MyNode start;
    if(last==null) System.out.print("Empty");
    else{
      start=last;
      
      do{ 
           start=start.getNext();  
          System.out.println(start.getData());
         
      }
      while(start!=last);
            
                    System.out.println("last "+last.getData());
                    System.out.println("start "+start.getData());
    }
    }


    public void add(int i, Object e) {
       MyNode start=last;
        MyNode pre = start;
        System.out.println("before:");
         System.out.println("pre"+pre.getData());
                System.out.println("last "+last.getData());
                System.out.println("start "+start.getData());
                System.out.println();
        if(i>=0 && i<=size){
            start=start.getNext();
            for(int j=0;j<i;j++){
                pre=start;
                start=start.getNext();  
            }
            if(i==size){
                addEnd(e);
            }if(i==0){
                MyNode t=new MyNode(e,start);
               
                pre.setNext(t);
                last=pre;
                size++;
                
            }else{
               MyNode t=new MyNode(e,start);
               
                
                  
               pre.setNext(t);
                size++;
                
               
               
    }
    }
    }
     public void remove(int i) {
        MyNode start=last;
         MyNode pre = start;
        if(i>=size) System.out.println("ืcan not"); 
        if(i>=0 && i<size){
            start=start.getNext(); 
            for(int j=0;j<i;j++){
                pre=start;
                start=start.getNext();  
               
            }
               pre.setNext(start.getNext());
                if(start==last)
                {last=pre; }
                   
                    
                    size--;
            }
        else if(i==0){
        pre.setNext(start.getNext());
        }
   
        
    }            
        
    


    public Object get(int i) {

        MyNode start=last;
        if(i>=0 && i<size)
            start=start.getNext(); 
            for(int j=0;j<i;j++){
                start=start.getNext();  
            }
            return start.getData();
        
    
    }
    public void set(int i,Object e){

        MyNode start=last;
        if(i>=0 && i<=size){
            start=start.getNext(); 
            for(int j=0;j<i;j++){
                start=start.getNext();  
            }
        start.setData(e);
        }   
}
}
