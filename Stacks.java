package com.HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //////STACK//////
        Scanner scanner= new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Please enter string pattern");
        String input = scanner.nextLine();
        for (int i =0;i<input.length();i++){
            if (input.charAt(i)=='('||input.charAt(i)=='['||input.charAt(i)=='{'){
                stack.push(input.charAt(i));
            }
            else{
                if (stack.isEmpty()){
                    System.out.println("false");
                }
                else{
                    char pop = stack.pop();
                    if (input.charAt(i)=='('&& pop!=')'){
                        System.out.println("false");
                    }
                    else if (input.charAt(i)=='['&& pop!=']'){
                        System.out.println("false");
                    }
                    else if (input.charAt(i)=='{'&& pop!='}'){
                        System.out.println("false");
                    }
                }
            }
        }
        if (stack.isEmpty()){
            System.out.println(true);
        }
        else System.out.println(false);

        /////////SOLUTION I TYPED ON HACKERRANK
        // CREATING A NEW METHOD TO CHECK THE BALANCE IN PARENTHESIS.

        /*import java.util.*;
    class Solution{

	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		String input = "";
		while (sc.hasNext()) {
			 input=sc.next();
            //Complete the code
            System.out.println(Solution.isBalanced(input));
		}
        // String a = isBalanced(input);
		// System.out.println(a);
	}

    public static String isBalanced(String input){
         Stack<Character> stack = new Stack<>();
        for (int i =0;i<input.length();i++){
           if (input.charAt(i)=='('||input.charAt(i)=='['||input.charAt(i)=='{'){
               stack.push(input.charAt(i));
           }
           else{
               if (stack.isEmpty()){
                   return "false";
               }
               else{
                   char pop = stack.pop();
                   if (input.charAt(i)=='('&& pop!=')'){
                       return "false";
                   }
                   else if (input.charAt(i)=='['&& pop!=']'){
                      return "false";
                   }
                   else if (input.charAt(i)=='{'&& pop!='}'){
                       return "false";
                   }
               }
           }
       }
        if (stack.isEmpty()){
            return "true";
        }
        else{
            return "false";
        }

       }

    }



*/
    }
}
