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
public class NewMachine extends Machine {
    protected int A003 = 0;

    public NewMachine(Material M) {
        super(M);
    }

    public void ProduceA003() {
        if (getNumA001() - 1 >= 0 && getNumA002() - 1 >= 0) {
            getMat().setFe(getMat().getFe() + 10);
            getMat().setAl(getMat().getAl() + 10);
            A001--;
            A002--;
            A003++;
        }
    }

    public int getNumA003() {
        return A003;
    }
 }
