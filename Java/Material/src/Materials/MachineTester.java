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
public class MachineTester {

    public static void main(String[] args) {
        Material m = new Material(100, 70);
        System.out.println("Matrial: Iron = " + m.getFe() + " and Aluminium = " + m.getAl());
        Machine M = new Machine(m);
        int a = 0, b = 0;
        do {
            a = M.getNumA002();
            M.ProduceA002();
        } while (a < M.getNumA002());
        do {
            b = M.getNumA001();
            M.ProduceA001();
        } while (b < M.getNumA001());
        System.out.println("number of product A002 = " + a + " units");
        System.out.println("number of product A001 = " + b + " units");
        System.out.println("All value = " + (3400 * a + 2000 * b));
        m = new Material(100, 70);
        System.out.println("Matrial: Iron = " + m.getFe() + " and Aluminium = " + m.getAl());
        NewMachine N = new NewMachine(m);
        a = 0;
        b = 0;
        int c = 0;
        do {
            b = N.getNumA002();
            N.ProduceA002();
        } while (b < N.getNumA002());
        do {
            c = N.getNumA001();
            N.ProduceA001();
        } while (c < N.getNumA001());
        do {
            a = N.getNumA003();
            N.ProduceA003();
        } while (a < N.getNumA003());
        do {
            b = N.getNumA002();
            N.ProduceA002();
        } while (b < N.getNumA002());
        do {
            c = N.getNumA001();
            N.ProduceA001();
        } while (c < N.getNumA001());
        System.out.println("number of product A003 = " + a + " units");
        System.out.println("number of product A002 = " + b + " units");
        System.out.println("number of product A001 = " + c + " units");
        System.out.println("All value = " + (6000 * a + 3400 * b + 2000 * c));
    }
}

    

