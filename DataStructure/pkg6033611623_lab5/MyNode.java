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
public class MyNode {
    private Object data;
    private MyNode next;
    public MyNode(Object e,MyNode n){ data=e; next=n;}
    public void setNext(MyNode n){next=n;}
    public void setData(Object e){data=e;}
    public MyNode getNext(){return next;}
    public Object getData(){return data;}    
}
