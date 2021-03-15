package com.HackerRank;

import java.util.Scanner;

public class Simple_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter the length you desire of the array to be built : ");
        int length = scanner.nextInt();
        int[] values = new int[length];
        System.out.println("Please enter the integer the built the array :");
        for (int i =0; i<length;i++){
            values[i]=scanner.nextInt();
            sum+=values[i];
        }
        System.out.println("The array built is : ");
        for (int i =0;i<values.length;i++){
            System.out.print(values[i] +"\t");
        }
        System.out.println("The sum of the array built : "+sum);

    }
}
