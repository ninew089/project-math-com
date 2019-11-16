package pkg6033611623_lab12;
import java.util.Stack;
public class AVLTree {
    AVLnode root;
    public AVLTree(){root=null;}
    public void LeftRotation(AVLnode n,AVLnode p){
        System.out.println("LeftRotation..."+n.data);
        AVLnode b = n.right;
        n.right=b.left;
        b.left=n;
        if(p!=null) {
        if(n==p.right){p.right=b;}
        else{p.left=b;}
        updateHeight(root);
        }
}
    public void RightRotation(AVLnode n,AVLnode p){
        System.out.println("RightRotation...."+n.data);
        AVLnode b = n.left;
        n.left=b.right;
        b.right=n;
        if(p!=null) {
        if(n==p.right){p.right=b;}
        else{p.left=b;}
        updateHeight(root);
        }
}
    public void LRRotation(AVLnode n,AVLnode p){
        System.out.println("LRRotation....");
        AVLnode b = n.left,c=b.right;
        LeftRotation(b,n);
        RightRotation(n,p);
    }
    public void RLRotation(AVLnode n,AVLnode p){
        System.out.println("RLRotation....");
        AVLnode b = n.right,c=b.left;
        RightRotation(b,n);
        LeftRotation(n,p);
    }
    public boolean contain(int i){
        AVLnode s=root;
        if(s==null) return false;
        while(s!=null&&s.data!=i){
            if(i>s.data)s=s.right;
            else if(i<s.data)s=s.left;
        }
        if(s==null) return false;
        return s.data==i;
    }
    public void add(int i){
        System.out.println("add"+i);
        if(root==null){root=new AVLnode(i,1);}
        else{
            Stack st = new Stack();
            AVLnode s = root,p=s;
            while(s!=null){
                p=s;
                st.push(p);
                if(i>s.data){s=s.right;}
                else if(i<s.data){s=s.left;}
                else{return;}
            }
            
            if(i>p.data){p.right=new AVLnode(i,1);}
            else if(i<p.data){p.left=new AVLnode(i,1);}
            AVLnode a;
            updateHeight(root);
            while(!st.isEmpty()){
                p=(AVLnode)st.pop();
                if(!st.isEmpty()){a=(AVLnode)st.peek();}
                else{a=null;}
                if(getBalance(p)<-1){
                    if(getBalance(a)<1){LeftRotation(p,a);}
                    else{RLRotation(p,a);}
                }
                else if(getBalance(p)>1){
                    if(getBalance(a)>-1){RightRotation(p,a);}
                    else{LRRotation(p,a);}
                }
            }
        }
    }
    public int getBalance(AVLnode n){
        if(n!=null){
            AVLnode l = n.left,r=n.right;
            if(l!=null&&r!=null) return l.height-r.height;
            else if (l==null&&r!=null) return 0-r.height;
            else if (l!=null&&r==null) return l.height-0;
            else return 0;
        }
        else return 0;
    }
    public int updateHeight(AVLnode n){
        if(n!=null){
            n.height=Math.max(updateHeight(n.left),updateHeight(n.right))+1;
            return n.height;
        }
        else{return 0;} 
    }
    public void printInorder(AVLnode n){
        if(n==null)return;
        printInorder(n.left);
        System.out.print(" "+n.data+" ");
        printInorder(n.right);   
}
    public void printLongestPath(){
        AVLnode s=root;
        int i =1;
        while(s!=null&&(s.left!=null||s.right!=null)){
            System.out.print(s.data+" ");
            if(s.left!=null&&s.right!=null){
            if(s.left.height>=s.right.height){s=s.left;}
            else{s=s.right;}
            }
            else if(s.left!=null&&s.right==null)s=s.left;
            else if(s.left==null&&s.right!=null)s=s.right;
        }
        System.out.println(s.data);
    }
}