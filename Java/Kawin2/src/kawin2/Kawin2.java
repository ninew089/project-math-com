/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kawin2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Windows10Pro
 */
public class Kawin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
       int i = a.nextInt();
       Shape[] all= new Shape[i];
       int x=0;
       int does;
       Random rand = new Random();
       String line = a.nextLine();
       while(x<i){
           does=rand.nextInt(2);
           if(does==0){
               System.out.print("Circle ");
               line = a.nextLine();
               //System.out.println(line);
               int r = Integer.parseInt(line);
               //System.out.println(r);
               Circle Cir = new Circle(r);
               all[x]=Cir;
           }
           else if(does==1){
               System.out.print("Rectangle ");
               line = a.nextLine();
               //System.out.println(line);
               String[] spt = line.split(" ");
               int w = Integer.parseInt(spt[0]);
               int l = Integer.parseInt(spt[1]);
               
               //System.out.println(w+" "+l);
               Rectangle Reg = new Rectangle(w,l);
               all[x]=Reg;
           }
           x++;
       }
       Arrays.sort(all);
       for(x=0;x<all.length;x++){
           all[x].getArea();
       }
    }
    
}
