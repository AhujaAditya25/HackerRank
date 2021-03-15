package com.HackerRank;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class lists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the list.");
        int value = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        System.out.println("Please enter list elements.");
        for (int i=0;i<value;i++){
            list.add(scanner.nextInt());
        }
        System.out.println(list);

        System.out.println("Please enter number of Queries that are needed to be performed.");
        int queries = scanner.nextInt();
        for (int q =0; q<queries;q++){
            System.out.println("Please Enter the Operation you need top perform.");
            String operation = scanner.next().toLowerCase();
            if (operation.equals("insert")){
                System.out.println("Please Enter the the index value.");
                int index = scanner.nextInt();
                System.out.println("Please Enter the value to be inserted.");
                int newval = scanner.nextInt();
                list.add(index,newval);
                System.out.println("The updated list is : \n"+list);
            }
            else if (operation.equals("delete")){
                System.out.println("Enter the index which needs to be deleted. ");
                int delindex = scanner.nextInt();
                list.remove(delindex);
                System.out.println("The updated list is : \n"+list);
            }
            else System.out.println("Invalid Request.");
        }
        System.out.println("The final output lit after all the operations is : ");
        for (int r =0; r< list.size();r++){
            System.out.print(list.get(r).toString());
        }
    }
}
