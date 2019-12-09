/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.list;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author apple
 */
public class LabList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []alist={"you","love","me","lol","pool","you","met","heat"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(alist));
        JavaList.removeDup(list2);
        JavaList.sortLength(list2);
        JavaList.removeShort(list2);
    }
    
}
