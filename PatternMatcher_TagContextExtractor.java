package com.HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher_TagContextExtractor {
    public static void main(String[] args) {
        //<(\W)*[a-zA-Z0-9]*(\s)*[a-zA-Z0-9]*> //Pattern
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            //correct solution ---> <(.+)>([^<]+)</\\1>
            String regexpattern = "<(\\W)*[a-zA-Z0-9]*(\\s)*[a-zA-Z0-9]*>";
            Pattern pattern = Pattern.compile(regexpattern,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                line = line.replaceAll(regexpattern,"");
            }
            System.out.println(line);

            testCases--;
        }
    }
}
