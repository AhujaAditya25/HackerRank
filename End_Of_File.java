package com.HackerRank;
import java.io.*;
import java.util.*;

public class End_Of_File {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN.
            Print output to STDOUT. Your class should be named Solution. */
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()){
               String value =scanner.nextLine();
               count++;
                System.out.println(count +" "+value);
            }


//            if (scanner.hasNext()){
//                 value = scanner.nextLine();
//            }
//            System.out.println(value);

//            if (scanner.hasNextLine()){
//               String Line = scanner.nextLine();
//               count++;
//                System.out.println(count +" "+Line);
//            }
        }
    }

