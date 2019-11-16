/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab6;

/**
 *
 * @author apple
 */
public class BTNode {
    private Object data;
    private BTNode left;
    private BTNode right;
    public BTNode(Object e,BTNode l,BTNode r){
    data=e;
    left=l;
    right=r;
    }
    public void setLeft(BTNode l){ left=l;}
    public void setRight(BTNode r){right=r;}
    public void setData(Object e){data=e;}
    public BTNode getleft()
    { return left;}
    public BTNode getRight(){return right;}
    public Object getData(){return data;}
}
