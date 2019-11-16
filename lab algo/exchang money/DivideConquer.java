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
public class DivideConquer{
   double count=0;
   public DivideConquer(){
        this.count = count;
    }
   // คืนต่า indexMin
    public int getMinIndex(double [] a, int i, int j){
        int min = i;
        for (int k = i+1; k <=j ; k++) {
            if(a[k]<a[min])
                min = k;
        }
        return min;
    }
    // คืนค่าindexMax
    public int getMaxIndex(double [] a, int i, int j){
        int max = i;
        for (int k = i+1; k <=j ; k++) {
            if(a[k]>a[max])
                max = k;
        }
        return max;
    }
    //ใช้หาผล แบ่งเป็นสองข้าง
    Result maxProfitDivideConquer(double[] money, int start, int end) {
        
        double center=0.0;// ค่าprofit 
        if(start>=end){
            return new Result(0,0,0);
        }
        int mid = (int) (start +  (end-start)/2);
        Result left = maxProfitDivideConquer(money,start,mid);
        Result right = maxProfitDivideConquer(money,mid+1,end);
        double minLeftIndex = getMinIndex(money, start, mid);
        double maxRightIndex = getMaxIndex(money, mid, end);
        double max=money[(int)maxRightIndex];
        double min=money[(int)minLeftIndex];
        center = max-min;

        if(center>left.profit && center>right.profit){
         
            return new Result(center,minLeftIndex,maxRightIndex);
         
        }else if(left.profit>=center && left.profit>=right.profit){
            count=count+1;
            return left;
        }else{
            count=count+1;
            return right;
        
        
        }
       
      
    }
   
}
class Result{
    double profit=0;
    double buyDateIndex=0;
    double sellDateIndex=0;

    public Result(double profit, double buyDateIndex, double sellDateIndex){
        this.profit = profit;
        this.buyDateIndex = buyDateIndex;
        this.sellDateIndex = sellDateIndex;
       
    }
}