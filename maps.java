package com.HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////////////MAPS///////////

        Map<String,Long> phonebook = new HashMap<>();
        System.out.println("Please enter the number of queries to be executed.");
        int queries = scanner.nextInt();
        for (int i=0;i<queries;i++){
            System.out.println("Please enter name of the person.");
            String name = scanner.next();
            System.out.println("Please enter the phone number.");
            long number = scanner.nextLong();
            phonebook.put(name,number);
        }
        for (int i =0; i<queries;i++){
            System.out.println("please enter the name of the contact you want the ph.no. of:");
            String queryname = scanner.next();
            if (phonebook.containsKey(queryname)){
                long x = phonebook.get(queryname);
                System.out.println(queryname+"="+x);
            }
            else System.out.println("Not found");
        }
    }
}
/*
//the code is typed in again here because,
//full name was accepted on hackerrank and not here (INTELLIJ).

import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map<String,Long> phonebook = new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			long phone=in.nextLong();
			in.nextLine();
            phonebook.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
             if (phonebook.containsKey(s)){
               long x = phonebook.get(s);
               System.out.println(s+"="+x);
           }
           else{
             System.out.println("Not found");
           }
        }
		}
	}
*/
