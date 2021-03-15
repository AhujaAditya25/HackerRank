package com.HackerRank;

import java.util.*;

public class DictionaryAndHashmaps {
//        int value = 0;
//        for (int i =0; i< note.length;i++){
//            for (int j =0; j< magazine.length;j++){
//                if(note[i].equals(magazine[j])){
//                    value++;
//                }
//            }
//        }
//        if (value==note.length){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
        public static void checkMagazine(String[] magazine, String[] ransom) {
            HashMap<String, Integer> usableWords = makeMap(magazine);
            for (int i = 0; i < ransom.length; i++) {
                if (usableWords.containsKey(ransom[i]) && usableWords.get(ransom[i]) > 0) {
                    usableWords.merge(ransom[i], -1, Integer::sum); // uses the word
                } else {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }

        /* Creates and returns a HashMap out of an array of Strings */
        private static HashMap<String, Integer> makeMap(String[] words) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                map.merge(words[i], 1, Integer::sum);
            }
            return map;
        }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);
        int n = Integer.parseInt(mn[1]);
        String[] magazine = new String[m];
        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
