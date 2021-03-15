package com.HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class Hashsets {
    public static void main(String[] args) {

        ////HASHSET////


        HashSet<String> hashSet = new HashSet<>();
       Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }
        for (int i =0;i<t;i++){
            String input  = pair_left[i] + " " + pair_right[i];
            hashSet.add(input);
        }

        System.out.println(hashSet);
        System.out.println(hashSet.size());


        ///// EASIEST SOO FAR //////


        /*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
HashSet<String>hashSet = new HashSet<>();

for (int i =0;i<t;i++){
            String input  = pair_left[i] + " " + pair_right[i];
            hashSet.add(input);
            System.out.println(hashSet.size());
        }
        // System.out.println(hashSet.size());
//Write your code here

   }
}*/
    }
}
