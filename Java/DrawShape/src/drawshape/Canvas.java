/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawshape;

import java.util.ArrayList;

/**
 *
 * @author werapan
 */
public class Canvas {
    private char[][] canvasBuffer;
    private int size;
    private ArrayList<Shape> shapes;
    public Canvas(int size) {
        this.size = size;
        canvasBuffer = new char[size][size];
        shapes=new ArrayList<>();
        initCanvasBuffer();
    }
    
    private void initCanvasBuffer() {
        for(int i=0;i<this.size;i++) {
            for(int j=0;j<this.size;j++) {
                canvasBuffer[i][j]='.';
            }
        }
    }
    
    private void paintToBuffer() {
//        for(int i=0;i<shapes.size();i++) {
//            Shape s=shapes.get(i);
        for(Shape s:shapes) {
            s.paint(this);
        }
    }
    
    public void paint() {
        System.out.println("Paint canvas");
        this.paintToBuffer();
        for(int i=0;i<this.size;i++) {
            for(int j=0;j<this.size;j++) {
                System.out.print(canvasBuffer[i][j]);
            }
            System.out.println();
        }
    }
    
    public void draw(int row, int col, char ch) {
        if(row>=size || col>=size) 
            return;
        canvasBuffer[row][col]=ch;
    }
    
    public void add(Shape shape) {
        shapes.add(shape);
    }
    
    
}
