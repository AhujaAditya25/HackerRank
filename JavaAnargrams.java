package com.HackerRank;

//import java.util.Arrays;
import java.util.Scanner;

public class JavaAnargrams {
//    static char[] seq1 ;
//    static char[] seq2 ;
//    static boolean value = true;

        static boolean isAnagram(String a, String b) {
             a=a.toLowerCase();
             b=b.toLowerCase();
            int count=0;
            int count2=0;

            if(a.length()!=b.length())
            {
                return false;
            }

            for(int i=0; i<a.length(); i++)
            {
                char ch=a.charAt(i);
                for(int j=0; j<a.length(); j++)
                {
                    if(a.charAt(j)==ch)
                        count++;
                    if(b.charAt(j)==ch)
                        count2++;
                }
                if(count!=count2)
                {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }
    }


