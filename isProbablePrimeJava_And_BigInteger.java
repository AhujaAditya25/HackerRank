package com.HackerRank;

//import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class isProbablePrimeJava_And_BigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the value you want to check (Prime/Divisible).");
        String n = scanner.next();
        BigInteger val = new BigInteger(String.valueOf(n));
        boolean result = val.isProbablePrime(1);
        if (result){
            System.out.println("prime");
        }
        else System.out.println("not prime");

        ////BIG INTEGER/////

        System.out.println("Please enter 2 BigInteger values for addition followed By" +
                " multiplication.");

//        long a = scanner.nextLong();
//        long b = scanner.nextLong();
        BigInteger A = new BigInteger(scanner.next());
        BigInteger B = new BigInteger(scanner.next());
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
//        System.out.println(C);
//        System.out.println(D);




    }
}
