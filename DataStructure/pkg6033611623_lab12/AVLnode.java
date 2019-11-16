package pkg6033611623_lab12;
public class AVLnode {
    int height;
    int data;
    AVLnode left;
    AVLnode right;
    AVLnode(int i,int h){data=i;left=null;right=null;height=h;}
    public void setData(int i){data=i;}
    public void setLeft(AVLnode l){left=l;}
    public void setRight(AVLnode r){right=r;}
    public void setHeight(int i){height=i;}
}
