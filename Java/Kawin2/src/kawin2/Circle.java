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
public class Circle extends Shape implements PI{

    private int r;
    
    public Circle(int r){
        super();
        this.r = r;
        id=No;
        No++;
        area=PI*r*r;
    }
    
    @Override
    public void getArea() {
        System.out.printf("%d (Circle) : %.2f\n",super.id,area);
    }

    @Override
    public int compareTo(Shape t) {
        return super.compareTo(t);
    }





    
}
