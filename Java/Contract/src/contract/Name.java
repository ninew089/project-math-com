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
public class Name {
    private String first;
    private String last;
    private String middle;
    Name(String first,String middle,String last){
        this.first=first;
        this.middle=middle;
        this.last=last;
        
    }
    String getName(){
        return first+" "+middle+" "+last;
    }
    void setFirts(String first){
        this.first=first;
    }
    void setMiddle(String middle){
        this.middle=middle;
    }
    void setLast(String last){
        this.last=last;
    }
    
}
