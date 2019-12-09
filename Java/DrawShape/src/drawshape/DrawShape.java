/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

/**
 *
 * @author werapan
 */
public class DrawShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canvas canvas = new Canvas(50);
        
        Rectangle r1 = new Rectangle('*',5,18);
        r1.setRowCol(10, 10);
        canvas.add(r1);
        
        Rectangle r2 = new Rectangle('x',10,5);
        r2.setRowCol(22, 12);
        canvas.add(r2);
        
        Square s1 = new Square('s',8);
        s1.setRowCol(3, 25);
        canvas.add(s1);

        RightTriangle t1 = new RightTriangle('t',8);
        t1.setRowCol(40,40);
        canvas.add(t1);
        
        Circle c1 = new Circle('c',3);
        c1.setRowCol(15, 15);
        canvas.add(c1);
        

        
        canvas.paint();
    }
    
}
