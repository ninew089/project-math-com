/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apple
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
//        ArrayList<Integer> a = new ArrayList<>();
//        a.toArray();
//        String[] gg = {"1","2","3"};
//        ArrayList<String> n = new ArrayList<String>(Arrays.asList(gg));
//        n.add("lol");
//        n.remove("lol");
//        ;
//        System.out.println(Arrays.toString(n.toArray()));
        t(3);
        }catch(IOException ex){
            System.out.println(ex);
        }
        try {
            RandomAccessFile a = new RandomAccessFile("wtf.txt","rw");
            System.out.println(a.getFilePointer());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void t(int r) throws IOException{
        if(r>0){
            throw new IOException("mathmo : araideewa");
        }
        else{
            throw new IOException("mathmo : A");
        }
    }
    
}
