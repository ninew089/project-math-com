/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab12_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

/**
 *
 * @author Admin
 */
public class BankAccount {
    private String name;
    private double balance;
    RandomAccessFile r = null;
    public BankAccount(String name,double initialBalance){
        this.name = name;
        File file = new File(name+".txt");
        
        try{
                r = new RandomAccessFile(file,"rw");
                if((r.readLine())!=null){
                    System.out.println(name+": This account already exists.");
                    String tmp;
                    r.seek(0);
                    while((tmp = r.readLine())!=null){
                        //System.out.println(tmp);  
                        //System.out.println(r.getFilePointer());
                    }
                    r.seek(r.getFilePointer()-13);
                    tmp = r.readLine();
                    double sum = 0;
                    int p = 0;
                    //System.out.println(r.readChar());
                    for(int i=5;i>0;i--){
                        sum = sum+(Character.getNumericValue(tmp.charAt(p))*(Math.pow(10, i-1)));
                        p=p+2;
                    }
                    this.balance = sum;
                    //r.seek(r.length());
                    //System.out.println(r.readChar());
                }
                else{
                    if(initialBalance < 500){
                        System.out.println("Initial balance is not avaliable");
                        r.close();
                        file.deleteOnExit();
                    }
                    else{
                        this.balance = initialBalance;
                        r.writeChars("***Deposit***  ***Withdraw***  ***Balance***");
                        r.writeBytes(System.getProperty("line.separator"));
                        String b = String.valueOf(balance);
                        for(int i = 1;i <= 13-b.length();i++){
                            r.writeChar('*');
                        }
                        r.writeChars(b);
                        r.writeChars("  ");
                        r.writeChars("--------------");
                        r.writeChars("  ");
                        for(int i = 1;i <= 13-b.length();i++){
                            r.writeChar('*');
                        }
                        r.writeChars(b);
                    }
                }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public void deposit(double amount) throws IOException{
        r.writeBytes(System.getProperty("line.separator"));
        String b = String.valueOf(amount);
        for(int i = 1;i <= 13-b.length();i++){
            r.writeChar('*');
        }
        r.writeChars(b);
        r.writeChars("  ");
        r.writeChars("--------------");
        r.writeChars("  ");
        balance = balance+amount;
        String c = String.valueOf(balance);
        for(int i = 1;i <= 13-c.length();i++){
            r.writeChar('*');
        }
        r.writeChars(c);
    }
    public void withdraw(double amount) throws IOException{
        if(balance >= amount){
            r.writeBytes(System.getProperty("line.separator"));
            String b = String.valueOf(amount);
            r.writeChars("-------------");
            r.writeChars("  ");
            for(int i = 1;i <= 14-b.length();i++){
                r.writeChar('-');
            }
            r.writeChars(b);
            r.writeChars("  ");
            balance = balance-amount;
            String c = String.valueOf(balance);
            for(int i = 1;i <= 13-c.length();i++){
                r.writeChar('*');
            }
            r.writeChars(c);
        }
        else{
            System.out.println(name+": Withdrawal of "+amount+" exceeds balance of "+balance);
        }
    }
}