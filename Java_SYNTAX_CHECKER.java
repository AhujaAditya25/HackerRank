package com.HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Java_SYNTAX_CHECKER {
    public static void main(String[] args) {
        /*
        INPUTS EXAMPLE :
            3
            ([A-Z])(.+)
            [AZ[a-z](a-z)
            batcatpat(nat
         */

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            String regex = scan.nextLine();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}
