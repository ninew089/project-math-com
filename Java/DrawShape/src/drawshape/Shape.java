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
public abstract  class Shape {
    protected String name;
    protected char paintChar;
    protected int row;
    protected int col;
    public Shape(String name, char paintChar) {
        this.name = name;
        this.paintChar=paintChar;
        this.row = 0;
        this.col = 0;
    }
    public void setRowCol(int row, int col) {
        this.setRow(row);
        this.setCol(col);
    }
    
    public abstract void paint(Canvas canvas);

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return the col
     */
    public int getCol() {
        return col;
    }

    /**
     * @param col the col to set
     */
    public void setCol(int col) {
        this.col = col;
    }
}
