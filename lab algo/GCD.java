/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author apple
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static int gcd3(int m,int n){
    
      
        if(m==0 ||n==0){
           return 0;
        }
        if(m-n==0){
            return m;
        }
        if(m<n){
            return gcd3(m,n-m);
          
        }
         if(m>n){
             return gcd3(n,m-n);
            
        }
         else{return gcd3(n,m);}
    }
    public static void main(String[] args) {
    
    int a = 3, b = 18, g; 
        g = gcd3(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + g); 
    }
    
    
}
