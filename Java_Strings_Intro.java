package com.HackerRank;

import java.util.Scanner;

public class Java_Strings_Intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter 2 String Values.");
        String value1 = scanner.next();
        String value2 = scanner.next();
        int length = value1.length() + value2.length();
        System.out.println(length);
        if (value1.compareTo(value2)>0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        String firstletterValue1 = value1.substring(0,1);
        String remainingValue1 = value1.substring(1);
        firstletterValue1=firstletterValue1.toUpperCase();
        System.out.print(firstletterValue1+remainingValue1+" ");

        String firstletterValue2 = value2.substring(0,1);
        String remainingValue2 = value2.substring(1);
        firstletterValue2= firstletterValue2.toUpperCase();
        System.out.print(firstletterValue2+remainingValue2);

    }
}
