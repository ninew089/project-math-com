/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class LineNumber {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try{
        Scanner in =new Scanner(new File("v.txt"));
        double sum=0.0;
        while(in.hasNext()){
            String t=in.nextLine().trim();
            int j=t.indexOf(" ");
            if(j>0){
                String sc=t.substring(j);
                double p=Double.parseDouble(sc);
                sum+=p;
            }
            
        }
        System.out.println(sum);
       
        }catch (IOException e) {
        String s=e.getMessage();
        System.out.print(s);
    }
    }
   }

   