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
public class Machine {   
    private Material Mat ;
    protected int A001 = 0, A002 = 0;

    public Machine(Material M) {
        Mat = M;
    }

    public void ProduceA001() {
        if (Mat.getFe() - 20 >= 0 && Mat.getAl() - 20 >= 0) {
            Mat.setFe(Mat.getFe() - 20);
            Mat.setAl(Mat.getAl() - 20);
            A001++;
        }
    }

    public void ProduceA002() {
        if (Mat.getFe() - 35 >= 0 && Mat.getAl() - 20 >= 0) {
            Mat.setFe(Mat.getFe() - 35);
            Mat.setAl(Mat.getAl() - 20);
            A002++;
        }
    }

    public int getNumA001() {
        return A001;
    }

    public int getNumA002() {
        return A002;
    }

    public Material getMat() {
        return Mat;
    }
    
}
