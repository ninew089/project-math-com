/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

/**
 *
 * @author apple
 */
public class Date {
    private int m;
    private int d;
    private int y;
    Date(int m,int d,int y){
        this.m=m;
        this.y=y;
        this.d=d;
    }
    void setDate(int m,int d,int y){
        this.m=m;
        this.y=y;
        this.d=d;
    }
    int getM(){
        return m;
       
    }
    int getY(){
        return y;
    }
    int getD(){
        return d;
    }
    public String toString(){
        return d+"/"+m+"/"+y;
    }
}
