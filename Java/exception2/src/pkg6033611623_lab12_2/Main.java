/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6033611623_lab12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("secret.txt");
        Scanner read = new Scanner(file);
        ArrayList<String> sentence = new ArrayList<>();
        int[] ans = new int[7];
        int[] each = new int[3];
        int count = 0;
        int found = 0, temp = 0;
        while (read.hasNextLine()) {
            sentence.add(read.nextLine().trim());
        }
        for (int i = 0; i < sentence.size(); i++) {
            count = 0;
            found = 0;
            System.out.println(sentence.get(i) + " " + count);
            for (int j = 0; j < sentence.get(i).length(); j++) {
                if ((int) (sentence.get(i).charAt(j) - '0') <= 9 && (int) (sentence.get(i).charAt(j) - '0') >= 0) {
                    System.out.println(sentence.get(i).charAt(j) + " " + count +" :" + (int)(sentence.get(i).charAt(j) - '0'));
                    if (found == 0) {
                        each[count] = (int) (sentence.get(i).charAt(j)-'0');
                        found++;
                        System.out.println("*"+each[count]+"*");
                    } else {
                        each[count] = (each[count] * 10) + (int) (sentence.get(i).charAt(j)-'0');
                        found++;
                        System.out.println("*"+each[count]+"*");
                    }
                } else {
                    if (found >= 1) {
                        count++;
                    }
                    found = 0;
                }
            }
            temp = each[0] * each[1];
            for (int k = each[2]-1; k < 7; k++) {
                ans[k] += temp;
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + (i + 1) + ": " + ans[i]);
        }
    }
}
