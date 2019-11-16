/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author apple
 */
public class Algo3 {

    public static void main(String[] args) {
           
        String d  = "UPUPUPUPUPUPUPUPUPUP"; //ใส่ข้อมูล
        char in = d.charAt(0);
        char[]data = d.toCharArray();    
        
        
        
        int K=2;  //ใส่ค่าK
        int j = data.length;
        System.out.println();
        simple(data,j,K);
        simple2(data,j,K);
        simple3(data,j,K);
       
    }
    public static void simple(char[] data,int j,int K){
        ArrayList<Integer> Uber = new ArrayList<Integer>();
        ArrayList<Integer> Pas = new ArrayList<Integer>();
        int iUber = 0;
        int iPas = 0;
        int output=0;
        
        while(iUber<j){
             if(data[iUber]=='U'){
                 Uber.add(iUber); 
             }
             iUber++;
         }
         while(iPas<j){
             if(data[iPas]=='P'){
                 Pas.add(iPas); 
             }
             iPas++;
         }
         iUber = 0;
         iPas = 0;
         while(iUber<Uber.size() && iPas<Pas.size()){//////
             if(Math.abs(Uber.get(iUber)-Pas.get(iPas))<=K){
                 output=output+1;
                 iPas++;
                 iUber++;
             }
             else if(Uber.get(iUber)>Pas.get(iPas)){
                 iPas++;
             }
             else{ 
                 iUber++;
             }
         }
        System.out.print("Input = " + Arrays.toString(data)+"\n");
        System.out.print("K = " + K+"\n");
        System.out.println("output = " + output+"\n");
    }
    public static void simple2(char[] data,int j,int K){
        ArrayList<Integer> Uber = new ArrayList<Integer>();
        ArrayList<Integer> Pas = new ArrayList<Integer>();
        ArrayList<Integer> Out = new ArrayList<Integer>();
        int iUber = 0;
        int iPas = 0;
        int output=0;
        int n=2;
        int jom=0;
        
        while(iUber<j){
             if(data[iUber]=='U'){
                 Uber.add(iUber); 
             }
             iUber++;
         }
         while(iPas<j){
             if(data[iPas]=='P'){
                 Pas.add(iPas); 
             }
             iPas++;
         }
         iUber = 0;
         iPas = 0;
         while(iUber<Uber.size() && iPas<Pas.size()){//////
             if(Math.abs(Uber.get(iUber)-Pas.get(iPas))<=K){
                 output=output+1;
                 iPas++;
                if(jom<n) 
                   jom++;
                else{
                    Out.add(jom);
                    jom=0;
                 iUber++;   
                }
                  
             }
             else if(Math.abs(Uber.get(iUber)-Pas.get(iPas))>K)  {
                    Out.add(jom);
                    jom=0;
                    iUber++; 
                        } 
             
             else if(Uber.get(iUber)>Pas.get(iPas)){
                 iPas++;
             }
             else if(Uber.get(iUber)<=Pas.get(iPas)){ 
                 iUber++;
             }
         }
         if(jom !=0){
             Out.add(jom);
             jom=0;
         }
        System.out.print("Input = " + Arrays.toString(data)+"\n");
        System.out.print("K = " + K+"\n");
        System.out.println("output = " + Out+"\n");
    }
    public static void simple3(char[] data,int j,int K){
        ArrayList<Integer> Uber = new ArrayList<Integer>();
        ArrayList<Integer> Pas = new ArrayList<Integer>();
        int iUber = 0;
        int iPas = 0;
        int output=0;
        
        while(iUber<j){
             if(data[iUber]=='U'){
                 Uber.add(iUber); 
             }
             iUber++;
         }
         while(iPas<j){
             if(data[iPas]=='P'){
                 Pas.add(iPas); 
             }
             iPas++;
         }
         iUber = 0;
         iPas = 0;
         while(iUber<Uber.size() && iPas<Pas.size()){//////
             if(Math.abs(Uber.get(iUber)-Pas.get(iPas))<=K){
                 output=output+1;
                 iPas+=2;
                 iUber++;
             }
             else if(Uber.get(iUber)>Pas.get(iPas)){
                 iPas++;
             }
             else{ 
                 iUber++;
             }
         }
        System.out.print("Input = " + Arrays.toString(data)+"\n");
        System.out.print("K = " + K+"\n");
        System.out.print("output = " + output+"\n");
    }
}
    
    //ให้น้ำหนักคน //น้ำหนักที่รถรับได้
//   public static void W(char[] data,int[] Weight,int j,int K){
//       ArrayList<Integer> Uber = new ArrayList<Integer>();
//       ArrayList<Integer> Pas = new ArrayList<Integer>();
//       ArrayList<Integer> Wei = new ArrayList<Integer>();
//       ArrayList<Integer> Rubkon = new ArrayList<Integer>();
//       
//       int iUber = 0;
//       int iPas = 0;
//       int iWei = 0;
//       int output=0;
//       int rubkikon = 0;
//
//        while(iUber<j){
//             if(data[iUber]=='U'){
//                 Uber.add(iUber); 
//             }
//             iUber++;
//         }
//        while(iPas<j){
//             if(data[iPas]=='P'){
//                 Pas.add(iPas); 
//             }
//             iPas++;
//        }
//        while(iWei<j){
//                 Wei.add(Weight[iWei]); 
//                 iWei++;
//             }
//        iUber = 0;
//        iPas = 0;
//        while(iUber<Uber.size() && iPas<Pas.size()){//////
////            
////             if(Math.abs(Uber.get(iUber)-Pas.get(iPas))<=K){ //แปลว่าอยู่ในระยะที่รับได้
////                 if(Wei.get(Uber.get(iUber))>= Wei.get(Pas.get(iPas))){ //แปลว่า เอา wei ตัวที่ 0,2,3,4,5,6
////                     Wei.set(Uber.get(iUber), Wei.get(Uber.get(iUber))-Wei.get(Pas.get(iPas))); // set ค่า uber - pas เป็น uber ที่เหลือ
////                     iPas++;
////                     rubkikon = rubkikon+1;
////                 }
////                 else if((Wei.get(Uber.get(iUber))< Wei.get(Pas.get(iPas)))  ){
////                     Rubkon.add(rubkikon);
////                     rubkikon =0;
////                     iUber++;
////                 }
////             }
////             else{
////              if(Uber.get(iUber)>Pas.get(iPas)){
////                 iPas++;
////             }
////             else{
////                 iUber++;
////             }
////        } 
////        }
////        if(rubkikon!=0){
////            Rubkon.add(rubkikon);
////            rubkikon =0;
////        }
//    System.out.print("Input = " + Arrays.toString(data)+"\n");
//    System.out.print("Input = " + Arrays.toString(Weight)+"\n");
//    System.out.print("K = " + K+"\n");
//    
//    System.out.print("Rubkon = ");
//    for(int r = 0 ; r<Rubkon.size() ; r++){
//        System.out.print(Rubkon.get(r)+ " ");
//    }
//    System.out.print("\n");
//    System.out.print("output = " + Rubkon.size()+"\n");    
//   }      
//
////หาความถี่
// public static void Frequency(char[] data,int j){
//     int Cp = 0;
//     int Cu = 0;
//     int i = 0;
//     while(i<j){
//        if(data[i] == 'U'){
//            Cu=Cu+1;
//            i++;
//        }
//        else if(data[i] == 'P'){
//            Cp=Cp+1;
//            i++;
//        }
//    }
//     System.out.print("Frequency U =" +Cu + "\n");
//     System.out.print("Frequency P =" +Cp+"\n");     
//}
// 
////คนมาตามเวลา รถมาตามเวลา
// //    public static void Tim()
//         
//         
//         
//         
//}          
         
         
         
         
//         while(i1<j){
//           
//         while(i2 < j){ //i2>=-K && ออกได้             
//             if(data[i1]=='O'){
//                 i1++;
//                 break;
//             } 
//
//             if(data[i1]=='U'){
//                if(i1-i2<0){
//                 i2--; 
//                 continue;
//                }   
//                if(i1-i2>=0 && i1-i2<j ){
//                    if(data[i1-i2] == 'P'){
//                        output = output+1;
//                        data[i1-i2] = 'O'; //แปลว่าใช้ไปแล้ว
//                        i1++;
//                        i2=K;
//                        break;
//                    }
//                    else if(i2<-K){   
//                            i1++;
//                            i2=K;
//                            break;
//                        }
//                    else{
//                        i2--; 
//                    }
//                }
//                else{
//                    i1++;
//                    i2=K;
//                    break;
//                }
//            }
//            else{
//                i1++;
//                i2=K;
//                break;
//            }
//        }
//         }
//         System.out.print("Input = " + Arrays.toString(data1)+"\n");
//         System.out.print("K = " + K+"\n");
//         System.out.print("output = " + output+"\n");

         

             
                 
 //            else if(i1+i2< j){
                   
  //                  if(data[i1+i2] == 'P'){
   //                       output = output+1;
    //                      data[i1+i2] = 'O';
   //                       i1++;
   //                       i2=1;
    //                      break;
   //                   }   
   //                  else{
   //                     if(i2+1<=K){
  //                            i2++;
  //                        }
  //                        else{
  //                            i1++;
  //                            i2=1;
  //                            break;
  //                        }  
   //                   }
   //               }
                 
                 
                 
                 
                 
                 
   //               if((i1-i2>=0 && i1-i2< j) && (i1+i2>=0 && i1+i2< j)){ //i1-i2< j,i1+i2>=0 ไม่ต้องเช็คก็ได้
 //
  //                 if(data[i1-i2] == 'P'){
 //
   //                      output = output+1;
  //                      data[i1-i2] = 'O'; //แปลว่าใช้ไปแล้ว
   //                       i1++;
   //                       i2=1;
   //                       break;
   //                   }
  //                    else if(data[i1+i2] == 'P'){
   //                       output = output+1;
  //                        data[i1+i2] = 'O';
  //                        i1++;
  //                        i2=1;
  //                        break;
   //                   }
  //                    else{ // ไม่มีไรเท่าเลย
   //                       if(i2+1<=K){
   //                       }
   //                       else{
   //                           i1++;
   //                           i2=1;
    //                          break;
   //                       }
  //                    }
                 
  //               } 
  //                else if(i1-i2>=0){
  //                    if(data[i1-i2] == 'P'){
  //                        output = output+1;
  //                        data[i1-i2] = 'O'; //แปลว่าใช้ไปแล้ว
   //                       i1++;
   //                       i2=1;
   //                       break;
   //               }
    //                  else{
   //                     if(i2+1<=K){
      //                        i2++;
    //                      }
     //                     else{
    //                          i1++;
     //                         i2=1;
      //                        break;
      //                    }  
      //                }
                     
     //             }
                 
      //            else if(i1+i2< j){
     //                if(data[i1+i2] == 'P'){
   //                       output = output+1;
    //                      data[i1+i2] = 'O';
  //                        i1++;
    //                      i2=1;
    //                      break;
    //                  }
                    
    //                  }
                
    //              else{ // ไม่มีไรเท่าเลย
    //                      if(i2+1<=K){
  //                            i2++;
    //                      }
    //                      else{
     //                         i1++;
     //                         i2=1;
   //                           break;
     //                     }
     //             }
     //         }
     //         else{ //มันไม่เท่ากับ U
      //          i1++;
      //          
      //          break; 
      //        }
     //     }
   //  }


