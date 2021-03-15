package com.HackerRank;

import java.util.Scanner;

public class ReverseString_Pallindrome {

    public static void main(String[] args) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a String, to check if it has palindrome property.");
        String input = scanner.next();
       int i =0;
       int j = input.length()-1;
       while(j>i){
           if (input.charAt(i)==input.charAt(j)){
               result = true;
           }
           else {
               result= false;
           }
           i++;
           j--;
       }
       if (result){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }

    }
}
