package pkg6033611623_lab12;
public class Main1 {
    public static void main(String[] args) {
       AVLTree t = new AVLTree();
       t.add(20);
       t.add(39);
       t.add(12);
       t.add(8);
       t.add(3);
       System.out.println(t.contain(12));
       System.out.println(t.contain(25));
       t.add(48);
       t.add(58);
       t.add(28);
        t.printInorder(t.root);
        System.out.println("\n"+t.root.data);
        System.out.println(t.root.height);
        t.printLongestPath();
    }
    
}
