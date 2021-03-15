package com.HackerRank;

import java.util.Scanner;

public class TwoDArays {
    public static void main(String[] args) {


        ///////////2D_ARRAYS/////////////
        Scanner scanner =new Scanner(System.in);

        ///HOURGLASS ARE SOO HARD///
        System.out.println("Please Enter the number of rows .");
        int row = scanner.nextInt();
        System.out.println("Please enter number of columns.");
        int column = scanner.nextInt();

        int [][] twoDarray = new int[row][column];
        System.out.println("Please Enter Elements for "+row +" x "+column+" Array.");
        for (int i =0;i<row;i++){
            for (int j =0;j<column;j++){
                twoDarray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The array that's been created is :");
        for (int i =0; i<row;i++){
            for (int j =0; j<column; j++){
                System.out.print(twoDarray[i][j]+" ");
            }
            System.out.println();
        }

        int max_sum= Integer.MIN_VALUE;
        for(int i =0;i<row-2;i++){
            for (int j =0; j<column-2;j++){
                int sum = twoDarray[i][j]+twoDarray[i][j+1]+twoDarray[i][j+2]+twoDarray[i+1][j+1]
                        +twoDarray[i+2][j]+twoDarray[i+2][j+1]+twoDarray[i+2][j+2];
                if (sum>max_sum){
                    max_sum = sum;
                }
            }
        }

        System.out.println(max_sum);

        /////////////////SECOND APPROACH////////////////


/*
import java.io.*;
import java.util.*;

public class Solution {

    static int hourglassSum(int[][] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i > 1 && j > 1) {
                    int sum = a[i][j]
                            + a[i][j - 1]
                            + a[i][j - 2]
                            + a[i - 1][j - 1]
                            + a[i - 2][j]
                            + a[i - 2][j - 1]
                            + a[i - 2][j - 2];

                    if (sum > max)
                        max = sum;
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
*/
    }
}
