package com.HackerRank;

import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //////////ARRAYLIST/////////

        System.out.println("Please enter number of rows.");
        int number = scanner.nextInt();
        java.util.ArrayList<java.util.ArrayList<Integer>> rows = new java.util.ArrayList<>();

        for(int i =0; i<number;i++){
            System.out.println("Please enter no. of elements in the "+(i+1)+" row");
            int numbers = scanner.nextInt();
            java.util.ArrayList<Integer> row = new java.util.ArrayList<>();
            System.out.println("Please enter elements of "+(i+1)+" row.");
            for (int j = 0; j<numbers;j++){
                row.add(scanner.nextInt());
            }
            rows.add(row);
        }

        System.out.println(rows);

        System.out.println("Please enter the number of queries that you'd like to fire.");
        int get = scanner.nextInt();
        while(get!=0) {
            System.out.println("Please enter the row of the element and the sequence number.");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            try{
                int value = rows.get(x - 1).get(y - 1);
                System.out.println(value);
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }

            get--;
        }

    }
}
