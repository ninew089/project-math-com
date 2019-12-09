/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab12_3;

import java.io.IOException;
import pkg6033611623_lab12_3.BankAccount;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BankAccount b = new BankAccount("Peter Parker", 500);
        b.deposit(500);
        b.withdraw(200);
        b.withdraw(5000);
        System.out.println(b.getName()+" has "+b.getBalance()+" baht.");
        BankAccount c = new BankAccount("Steve Rogers", 500);
        System.out.println(c.getName()+" has "+c.getBalance()+" baht.");
        c.deposit(500);
        c.withdraw(200);
        c.withdraw(5000);
        System.out.println(c.getName()+" has "+c.getBalance()+" baht.");
    }
    
}
