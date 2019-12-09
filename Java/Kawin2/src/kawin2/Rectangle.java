/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawin2;

/**
 *
 * @author Windows10Pro
 */
public class Rectangle extends Shape{

    private int w,l;
    
        public Rectangle(int w,int l){
        super();
        this.w = w;
        this.l = l;
        id=No;
        No++;
        area=w*l;
    }
    
    @Override
    public void getArea() {
        System.out.printf("%d (Rectangle) : %.2f\n",super.id,area);
    }

    @Override
    public int compareTo(Shape t) {
        return super.compareTo(t);
    }




    
}
