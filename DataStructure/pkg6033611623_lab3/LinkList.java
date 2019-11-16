/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab3;

/**
 *
 * @author apple
 */
public class LinkList implements SortC{
    private MyNode first;
    private int size;
    public LinkList(){ first=null;size=0; }
    public boolean isEmpty(){return first==null;}
    public void printList(){
    MyNode start=first;
    while(start!=null){System.out.print(start.getData()+" "); start=start.getNext();}
    System.out.println();
    System.out.println("........................");
    }
    public void add(Object e) {
        if(contain(e))
        {
            System.out.println(e+" has already existed in list."); 
            return;
        }
        System.out.println("add value=="+e);
        if(isEmpty()){first=new MyNode(e,first);}
        else
        {
            MyNode cur1=first;
            MyNode cur2=null;
            int a=(Integer)cur1.getData();
            int v=(Integer)e;
            if(a>v){first=new MyNode(e,first);}
            else
            {
                while(cur1!=null&&a<v)
                {
                    cur2=cur1;
                    cur1=cur1.getNext();
                    if(cur1!=null)
                    a=(Integer)cur1.getData();
                }
                MyNode tmp=new MyNode(e,cur1);
                cur2.setNext(tmp);
            }
        }
    
    }


    public void remove(Object e) {
         if(isEmpty())
           return;
       else
           System.out.println("Remove :"+e);
       MyNode p=null,s=first;
       int a =(Integer)s.getData();
       int v =(Integer)e;
       while(s.getNext()!=null&&!(s.getData().equals(e))&&(a<v)){
           p=s;
           s=s.getNext();
           a=(Integer)s.getData();
       }
       if(!(s.getData().equals(e))){
           System.out.println("Not Found");
       }
       else{
           if(s==first)
               first=first.getNext();
           else
               p.setNext(s.getNext());
       }
    
        
    }
    public boolean contain(Object e) {
        MyNode start=first;
        while(start!=null && !(start.getData().equals(e)))
        {
            Integer b=(Integer)e;
            Integer a=(Integer)start.getData();
            if(a>b) 
                return false;
            start=start.getNext();
        }
            return start!=null;    
    }


    public int size() {return size; }


    
    
    
}
