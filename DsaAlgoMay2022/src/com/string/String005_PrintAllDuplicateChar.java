package com.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String005_PrintAllDuplicateChar {
    static final int NO_OF_CHARS = 126;

    public static void main(String[] args) {
        String s = "test string%% ";
        String trimmedString = s.replaceAll("[^a-zA-Z]", "");
        printDuplicateChars(trimmedString);
    }

    private static void printDuplicateChars(String s) {
        int[] count = new int[NO_OF_CHARS];

        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] > 1) {
                System.out.println("Character: "+(char)i + " has "+count[i]+ " occurrences.");
            }
        }
    }

    static void printDuplicateChars_HashMap(String str)
    {
        HashMap<Character, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i), count.get(str.charAt(i)) + 1);
        }

        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());

            if (value > 1)
                System.out.println(key
                        + ", count = " + value);
        }
    }
}

/*
OUTPUT::
Character: s has 2 occurrences.
Character: t has 3 occurrences.
*/
