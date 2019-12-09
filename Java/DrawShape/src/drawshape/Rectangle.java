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
public class Rectangle extends Shape {
    
    int rowLen;
    int colLen;
    public Rectangle(char paintChar, int rowLen, int colLen) {
        super("Rectangle", paintChar);
        this.rowLen=rowLen;
        this.colLen=colLen;
    }

    @Override
    public void paint(Canvas canvas) {
        for(int i=0;i<rowLen;i++) {
            for(int j=0;j<colLen;j++) {
                canvas.draw(this.row+i, this.col+j, this.paintChar);
            }
        }
        
    }
    
}
