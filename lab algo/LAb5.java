/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apple
 */
import java.awt.Point;
import java.awt.geom.Point2D;

public class LAb5{
    
    static double MAX = 9999999;
    static String[][] path;
    static double table[][];
    static String[][] area;

double dist(Point2D.Double p1, Point2D.Double p2)
{
    return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) +
                (p1.y - p2.y)*(p1.y - p2.y));
}
 

double cost(Point2D.Double points[], int i, int j, int k)
{
    Point2D.Double p1 = points[i], p2 = points[j], p3 = points[k];
    return dist(p1, p2) + dist(p2, p3) + dist(p3, p1);
}

double  mTCDP(Point2D.Double points[], int n)
{
 
   if (n < 3)  return 0;
   
   path = new String[n][n];
   area = new String[n][n];
   table = new double[n][n];

   for (int gap = 0; gap < n; gap++)
   {
      for (int i = 0, j = gap; j < n; i++, j++)
      {
          if (j < i+2) // มีสาม vertices
             table[i][j] = 0.0;
          else
          {
              table[i][j] = MAX;
              for (int k = i+1; k < j; k++)
              {
                double val = table[i][k] + table[k][j] + cost(points,i,j,k);

               if (table[i][j] > val){
                     table[i][j] = val;  
               path[i][j] = i+""+k+""+j;
                
               System.out.print("  "+path[i][j]+'\n');
               }
                
              
              }

          }
      }
   }
   return  table[0][n-1];
}
    public static void main(String[] args)  {
        
        
       LAb5 l = new LAb5();
       //Point2D.Double[] p = {new Point2D.Double(1,2), new Point2D.Double(4,3), new Point2D.Double(5,7), new Point2D.Double(3,10), new Point2D.Double(0,7)};
        //Point2D.Double[] p = {new Point2D.Double(-5.5,-2), new Point2D.Double(4,0), new Point2D.Double(15,7), new Point2D.Double(2,10), new Point2D.Double(-3,6)};
       // Point2D.Double[] p = {new Point2D.Double(1,0), new Point2D.Double(4,3), new Point2D.Double(5,7), new Point2D.Double(1,10), new Point2D.Double(0,8), new Point2D.Double(0,0)};
        //Point2D.Double[] p = {new Point2D.Double(2.5,0), new Point2D.Double(4,3), new Point2D.Double(5,8), new Point2D.Double(2.5,10), new Point2D.Double(0,6.3), new Point2D.Double(1.5,0)};
        Point2D.Double[] p = {new Point2D.Double(-2,3), new Point2D.Double(-4,6), new Point2D.Double(3,5), new Point2D.Double(1,3)};
        //Point2D.Double[] p = {new Point2D.Double(-5.5,-2), new Point2D.Double(4,0), new Point2D.Double(2,10), new Point2D.Double(-3,6)};
        //Point2D.Double[] p = {new Point2D.Double(0,0), new Point2D.Double(0,4), new Point2D.Double(2,6), new Point2D.Double(6,3), new Point2D.Double(3,0)};
        
        System.out.println(l.mTCDP(p,p.length));
        String ans ="";

     
        int i=0,j= p.length-1,k;
  
        while(true){
        ans = ans  + path[i][j] + " ";
        String next[] = path[i][j].split("");
        i=Integer.parseInt(next[0]);
        k=Integer.parseInt(next[1]);
        j=Integer.parseInt(next[2]);
       
       if((j-k == k-i && table[i][k] < table[k][j] && k-i >=2) || (k-i > j-k) )j=k;  
        else if( (j-k == k-i && table[i][k] > table[k][j] && j-k >=2) || (k-i < j-k)) i=k;
        else break;
      
    }
          for(int e=0;e<table.length;e++){
             System.out.print('\n');
            for(int r=0;r<table.length;r++){
           
            System.out.print("  "+table[e][r]);
  
            
            }
        
        }
       

         System.out.print('\n');
          System.out.print('\n');
        System.out.println(ans);
        
    }
    
}
