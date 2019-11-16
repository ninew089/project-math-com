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
public class BinarySearchTree {
    private BTNode root;
    private int size;
    public BinarySearchTree(){root=null; size=0;}
    public int nnode(){return size;}
    public boolean isEmpty(){return root==null;}
    public boolean contain(Object e){
        BTNode start;
        start=root;
        int value=(Integer) e;
            while(start!=null){
            int BTNode=(Integer)start.getData();
            if(BTNode==value){return true;}
        else{
        if(BTNode>value){
            start=start.getleft();
        }else{
            start=start.getRight();}
        }
        }
        return false;
       }
    public void add(Object e){
        if(e==null){return;}
        BTNode start=root,pre=null;
        BTNode tmp=new BTNode(e,null,null);
        int value=(Integer)e;
            if(root==null){
            root=tmp;
            size++;
            }else{
                while(start!=null){
                pre=start;
                int BTNode =(Integer)start.getData();
                if(BTNode==value){
                    System.out.println("Object:"+e+"has existed in the tree");
                    start=null;
                    return;
                }else{
                    if(BTNode>value){
                    start=start.getleft();}
                    else{
                    start=start.getRight();
                    }
                    }
                }
                int curNode=(Integer)pre.getData();
                if(curNode>value){
                pre.setLeft(tmp);
                size++;
                }else if(curNode<value){
                    pre.setRight(tmp);
                    size++;
                }
            }
            
    }
    public void remove(Object e){
        BTNode start=root;
        BTNode pre=start;
        BTNode t=new BTNode(e,null,null);
        if(isEmpty() || !contain(e)){System.out.println("not found value");}
        else{
            while(start.getData()!=e){
                pre=start;
                if((Integer)e>(Integer)start.getData()){start=start.getRight();}
                else{start=start.getleft();}
            }
                if(start.getleft()==null &&start.getRight()==null){
                    if(start==pre.getleft()){pre.setLeft(null);}
                    if(start==pre.getRight()){pre.setRight(null);}
                    else{root.setData(null);}
                }else if(start.getleft()!=null && start.getRight()!=null){
                    pre=start;
                    start=start.getleft();
                    while(start.getRight()!=null){start=start.getRight();}
                    Object a=start.getData();
                    remove(start.getData());
                    pre.setData(a);
                }else{
                    if(start==pre.getleft()){
                        if(start.getleft()!=null){pre.setLeft(start.getleft());}
                        else{pre.setLeft(start.getRight());}
                    }else if(start==pre.getRight()){
                        if(start.getleft()!=null){pre.setRight(pre.getleft());}
                        else{pre.setRight(start.getRight());}
                    }else{root=null;}
                }
                }
        
        
        
    
    }
            public Object getMin(){
                BTNode start=root;
                if(start==null){return null;}
             
            while(start.getleft()!=null){start=start.getleft();}
                return start.getData();
            }
            public Object getMax(){
              BTNode start=root;
                if(start==null){return null;}
             
            while(start.getRight()!=null){start=start.getRight();}
                return start.getData();
            }
            public void printTree(){
            BTNode r=root;
            if(isEmpty()){System.out.println("Tree is empty");}
            System.out.println("Preorder");
            preOrder(r);
            System.out.println();
            System.out.println("Inorder");
            inOrder(r);
            System.out.println();
            System.out.println("Postorder");
            postOrder(r);
            System.out.println();
            }
            public void preOrder(BTNode r){
            if(r!=null){
            System.out.print(r.getData()+"\t");
            preOrder(r.getleft());
            preOrder(r.getRight());
                    }
            }
            public void inOrder(BTNode r){
            if(r!=null){
            
            inOrder(r.getleft());
            System.out.print(r.getData()+"\t");
            inOrder(r.getRight());
                    }
            }
            public void postOrder(BTNode r){
            if(r!=null){
            
            postOrder(r.getleft());
            postOrder(r.getRight());
             System.out.print(r.getData()+"\t");
                    }
            }
      
    
    
}
