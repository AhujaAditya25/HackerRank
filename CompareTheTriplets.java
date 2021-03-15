package com.HackerRank;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alicescore =0;
        int bobscore = 0;
        final int size = 3;
        int[] alicesarray = new int[size];
        int[] bobsarray = new int[size];
        System.out.println("Please enter alice's array : ");
        for (int i=0;i<size;i++){
            alicesarray[i] = scanner.nextInt();
        }
        System.out.println("Please Enter bob's array : ");
        for (int i=0;i<size;i++){
            bobsarray[i] = scanner.nextInt();
        }
        for (int i =0;i<size;i++){
                if (alicesarray[i]>bobsarray[i]){
                    alicescore++;
                }
                else if (alicesarray[i]<bobsarray[i]){
                    bobscore++;
                }
        }

        System.out.println("Bob's score : "+bobscore);
        System.out.println("Alice's score : "+alicescore);
        

    }
}
