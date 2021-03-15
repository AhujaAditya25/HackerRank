package com.HackerRank;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
class Printer{
    public static <T> void printArray (T[] obj){
        for (int i =0; i< obj.length;i++){
            System.out.println(obj[i]);
        }
    }
}
