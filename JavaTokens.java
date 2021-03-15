package com.HackerRank;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTokens {
    public static void main(String[] args) {
        int x = 0;
        int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text.");
        String s = scan.nextLine();
        String[] values = new String[s.length()];
        s= s.replaceAll("[^a-zA-Z0-9]"," ");
        StringTokenizer sr = new StringTokenizer(s," ");
        while(sr.hasMoreTokens()){
            values[x] = sr.nextToken();
            x++;
        }
        for (String item : values) {
            if (item != null) {
                count++;
            }
        }
        System.out.println(count);
        for (String value : values) {
            if (value!=null){
                System.out.println(value);
            }
        }



    }
}
