/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_6033601323;

import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Surface
 */
public class Lab1_6033601323 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
   
      // System.out.println(Arrays.toString(randomArray(5, 50, 1234)));
      // System.out.println(Arrays.toString(randomArray(10, 50, 1234)));
      int n[];
      int m[];
//      int[] b = {5,3,9,2};
//      int[] a = {9};
      n=randomArray(50000,100000,1234);
      m=randomArray(100000,100000,1234);
      
//      for(int i =0; i<n.length;i++){
//          System.out.print(n[i]+" ");
//      }
//        System.out.println("");
//        
//      for(int i =0; i<m.length;i++){
//          System.out.print(m[i]+" ");
//      }
//        System.out.println("");  
      
      System.out.println("subset1 "+ subset1(n,m));
      System.out.println("subset2 "+ subset2(n,m));
      
      long startTime = System.nanoTime();
//      TimeUnit.SECONDS.sleep(5);
//        System.out.println("sub"+ Arrays.toString(n));
//        System.out.println("sup"+ Arrays.toString(m));
        subset1(n,m);
      
      long endTime = System.nanoTime();
      long timeElapsed = endTime - startTime;
      System.out.println("Execution time in nanosecounds of subset1 : " + timeElapsed);
      
      long startTime2 = System.nanoTime();
//      TimeUnit.SECONDS.sleep(5);
        Arrays.sort(n); 
        Arrays.sort(m); 
//       System.out.println("sub"+ Arrays.toString(n));
//        System.out.println("sup"+ Arrays.toString(m));
        
      subset2(n,m);
     
      long endTime2 = System.nanoTime();
      long timeElapsed2 = endTime2 - startTime2;
      System.out.println("Execution time in nanosecounds of subset2 : " + timeElapsed2);
    }
    
    public static int[] randomArray(int size, int limit, int seed) {
        assert size <= limit;
        java.util.Random rand = new java.util.Random(seed);
        int[] numbers = new int[size];
        outerLoop:
        for (int i = 0; i < numbers.length; i++) {
            int candidate = rand.nextInt(limit) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == candidate) {
                    i--;
                    continue outerLoop;
                    }
                }
                numbers[i] = candidate;
            }
            return numbers;
        }

    public static void randomize(int[] array) {
        java.util.Random rand = new java.util.Random();
        for (int i = array.length; i > 1; i--) {
            int choice = rand.nextInt(i);
            int temp = array[choice];
            array[choice] = array[i - 1];
            array[i - 1] = temp;
        }
    }

    public static boolean subset1(int[] sub, int[] sup){
        int count = 0;
        for(int i = 0; i < sub.length; i++){
            for(int j = 0; j < sup.length; j++){
                if(sub[i] == sup[j]){
                 count++;
                
            }
        }
    }
        if(count == sub.length){
            return true;
    }
    return false;
//        int i = 0; 
//        int j = 0; 
//        for (i = 0; i < sub.length; i++) 
//        { 
//            for (j = 0; j < sup.length; j++) 
//                if(sub[i] == sup[j]) 
//                    break; 
//              
//            /* If the above inner loop  
//            was not broken at all then 
//            arr2[i] is not present in 
//            arr1[] */
//            if (j == sup.length) 
//                return false; 
//        } 
//          
//        /* If we reach here then all 
//        elements of arr2[] are present 
//        in arr1[] */
//        return true; 
}
    public  static boolean subset2(int[] sub, int[] sup){
        int count = 0;
//        System.out.println(sub);
//        System.out.println(sup);
//        Arrays.sort(sub); 
//        Arrays.sort(sup); 
        int i = 0;
        int j = 0;
        while( i < sub.length && j < sup.length) 
        { 
//            System.out.println(i);
//            System.out.println(j);
            if( sup[j] < sub[i] ) 
                j++; 
            
            else if( sup[j] == sub[i] ) 
            { 
                j++; 
                i++; 
            } 
            else if( sup[j] > sub[i] ) 
                return false; 
        } 
          
        if( i < sub.length ) 
            return false; 
        else
            return true; 
    }  
}


