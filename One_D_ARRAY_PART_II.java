package com.HackerRank;

import java.util.Scanner;

public class One_D_ARRAY_PART_II {
//    public static boolean canWin(int leap, int[] game) {
//        // Return true if you can win the game; otherwise, return false.
//
//    }

    public static boolean canWin(int leap, int[] game) {
        int count=0;
        int l =0;
        // Return true if you can win the game; otherwise, return false.
        for(int i =0; i<game.length;i++){
            if (game[i]==0){
                count++;
            }
            else break;;
        }
        if (count==game.length){
            return true;
        }
        else if (game[1]==1&&game[leap] >= game.length) {
                return true;
        }
        while (game[l]==0){
            if (l+leap >= game.length) {
                return true;
            }
            else if (game[l+1]==0&&l+leap<game.length&&game[l+leap]==1){
                l++;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
//////////////////SOLUTION THAT IS PERFECT///////////////////////
/*
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + 1 >= game.length || i + leap >= game.length)
            return true;

        game[i] = 1; //flag

        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
        }
        scan.close();
    }
}*/
