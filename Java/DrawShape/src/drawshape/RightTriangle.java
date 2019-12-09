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
public class RightTriangle extends Shape{
    
    private int len;
    
    public RightTriangle(char p,int l){
        super("RightTriangle",p);
        len=l;
    }
    
    public void paint(Canvas canvas){
        int i,j;
        for(i=0;i<len;i++){
            for(j=0;j<i;j++){
                canvas.draw(row+i, col+j, paintChar);
            }
        }
    }
}
