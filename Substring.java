package com.HackerRank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//        String result = S.substring(start,end);
//        System.out.println(result);

        String S = in.next();
        int k = in.nextInt();
        String smallest = "";
        String largest = "";
        smallest = S.substring(0,k);
        largest = S.substring(0,k);
         for (int i =0; i<S.length()-k;i++){
             String str = S.substring(i,i+k);
             if (smallest.compareTo(str)>0){
                 smallest = str;
             }
             if(largest.compareTo(str)<0){
                 largest=str;
             }
         }
        System.out.println(smallest + "\n" + largest);
         /*
         String smallest = "";
        String largest = "";
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
//         "Compare to" method doesn't turn just the equel case it also turns a value.
        for(int i=0; i<=s.length()-k; i++ ){
            String str = s.substring(i,k+i);
            if (smallest.compareTo(str)>0){
                smallest = str;
            }
            if(largest.compareTo(str)<0){
                largest=str;
            }
        }
        return smallest + "\n" + largest;
          */
    }
}
