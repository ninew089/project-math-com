/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materials;

/**
 *
 * @author USER
 */
public class Material {    
    private int Fe,Al;
    
    public Material(int F,int A){
        Fe=F;
        Al=A;
    }
    
    public Material(){
        Fe=0;
        Al=0;
    }
    
    public int getFe(){
        return Fe;
    }
    
    public int getAl(){
        return Al;
    }
    
    public void setFe(int a){
        Fe=a;
    }
    
    public void setAl(int a){
        Al=a;
    }
    
}
