package com.HackerRank;

import java.util.Scanner;

public class ifelse {
    private static final Scanner scanner = new Scanner(System.in);

    public static String print_IF_ELSE(int n){
        String answer = "NULL";
        if(n%2==0){
            if(n==2||n==4){
                // system.out.println("Not Weird");
                answer = "Not Weird";
            }
            else if (n>=6&&n<=20){
                //  system.out.println("Weird");
                answer ="Weird";
            }
            else if (n>20){
                //  system.out.println("Not Weird");
                answer = "Not Weird";
            }
        }
        else {
            //  system.out.println("Weird");
            answer = "Weird";
        }
        return answer ;
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String answer = print_IF_ELSE(N);
        System.out.println(answer);

        scanner.close();
    }
}
