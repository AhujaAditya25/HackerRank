package com.HackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bigdecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        BigDecimal[] a = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            a[i] = new BigDecimal(s[i]);
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
//                if (array[j]<array[i]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
                if (a[i].compareTo(a[j]) < 0) {
                    BigDecimal temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//        System.out.println("Array Sorted in descending order is : ");
        for (BigDecimal bigDecimal : a) {
            System.out.print(bigDecimal + " ");
        //FOR DESIRED ANSWER//

        /*
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);
        */

            sc.close();
        }
    }
}
