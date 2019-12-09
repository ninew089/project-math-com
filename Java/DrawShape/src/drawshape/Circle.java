/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

/**
 *
 * @author PREOATOR
 */
public class Circle extends Shape{
    private int radius;
    
    public Circle(char p,int r){
        super("Circle",p);
        radius=r;
    }
    
    public void paint(Canvas canvas){
        int i,j,a,r;
        int r2=2*radius;
        int Cxcenter=col+radius;
        int Cycenter=row+radius;
        for(i=0;i<=r2;i++){
            for(j=0;j<=r2;j++){
                a=(int) (Math.pow((row+i)-Cycenter,2)+Math.pow((col+j)-Cxcenter, 2));
                r=(int) (Math.pow(radius, 2));
                if(a<=r){
                    canvas.draw(row+i,col+j,paintChar);
                }
            }
        }
    }
}
