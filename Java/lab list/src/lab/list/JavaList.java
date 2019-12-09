/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.list;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
class JavaList {

    static void removeDup(ArrayList<String> x) {
        for (int i=0;i<x.size();i++){
            for(int j=i+1;j<x.size();j++){
                if(x.get(i)==x.get(j)){
                    x.remove(j);
                    j--;
                }
                
            }
            
        }
      System.out.println(x);  
    }

    static void removeShort(ArrayList<String> x) {
          for(int i=0;i<x.size()-1;i++){
                if(((String)x.get(i)).length()>((String)x.get(i+1)).length()){x.remove(i+1);}
                else x.remove(i);
            }
        System.out.println(x); 
    
    }

    static void sortLength(ArrayList<String> x) {
             for (int i=0;i<x.size();i++){
            for(int j=i+1;j<x.size();j++){
                String temp;
                if(x.get(i).length()>x.get(j).length()){
                    temp=x.get(i);
                    x.set(i,x.get(j));
                    x.set(j, temp);
                    
                }
                
            }
        
    }
             System.out.println(x);
    }
    
}
