/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author apple
 */
import java.util.Arrays;
import java.util.Scanner;

public class ExchangeMoney {

    public static void maxProfitBrute(double [] money){
        double  profit = -1;
        double  buyDateIndex = money[0];
        double  sellDateIndex = money[0];
        double price1=0;
        double price2=0;
        double totalday=0;
        int count=0;
        for (int i = 0; i <money.length ; i++) {
            for (int j = i; j <money.length ; j++) {
                    count++;
                if(money[j]>money[i] && (money[j]-money[i]>profit)) {
                    price2=money[j];
                    price1=money[i];
                    profit = money[j] - money[i];
                    buyDateIndex = i+1;
                    sellDateIndex = j+1;
                    totalday= sellDateIndex-buyDateIndex;
                
                }
            }
        }
        System.out.println("  ExchangeMoney Bruteforce " );
        System.out.println("Buy date index: " + buyDateIndex );
        System.out.println("Price 1: " + price1 );
        System.out.println("sell date index: " + sellDateIndex );
        System.out.println("Price 2: " + price2 );
        System.out.println("Maximum Profit: " + profit);
        System.out.println("totalday: " + totalday);
        System.out.println("count: " + count);
    }
  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the lenght of arrays:");
        int lenght=s.nextInt();

//        String []ss=new String[lenght];
        double []prices=new double[lenght];
        for (int i=0;i<lenght-1;i++)
        {
            prices[i]=s.nextDouble();
        }
//        ss=input.split(" ");
//        for(int i=0;i<lenght;i++){
//            prices[i]=Double.parseDouble(ss[i]);
//        
//        }
        //double []prices={27,18,95,81,6,70,1,13,22,1 };
        //double []prices={38 ,1 ,28, 30 ,7 ,5 ,22, 34, 21, 4 ,13, 31, 40, 8 ,37, 10, 2, 27, 26, 9, 36, 18, 33, 
          // 20, 23, 29, 32, 11, 39, 35, 6, 12, 15, 17, 14, 25, 24, 16, 19, 3};
        //double [] prices = {35.10,35.01,35.11,35.02,35.08,35.03,35.09,35.12,35.04,35.17,35.14,35.19,35.13,35.07,35.16,35.20,35.06,35.05,35.18,35.16};
        maxProfitBrute(prices);
        DivideConquer m = new DivideConquer();
        int start = 0;
        int end = prices.length-1;
        Result result = m.maxProfitDivideConquer(prices,start,end);
        double indexbuy=result.buyDateIndex +1.0;
        double indexsell=result.sellDateIndex +1.0;
        System.out.println("  ExchangeMoney Divide & Conquer " );
        System.out.println("Buy date index: " + (result.buyDateIndex +1.0));
        System.out.println("Price 1: " +prices[(int)indexbuy-1] );
        System.out.println("sell date index: " + (result.sellDateIndex +1.0));
        System.out.println("Price 2: " +prices[(int)indexsell-1] );
        System.out.println("Maximum Profit: " + result.profit);
        System.out.println("totalday: " + (indexsell-indexbuy));
        System.out.println("count: " + m.count);

    }
       
        
   }

    

