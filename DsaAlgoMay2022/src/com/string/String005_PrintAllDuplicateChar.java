package com.string;

import java.util.Arrays;

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
}

/*
OUTPUT::
Character: s has 2 occurrences.
Character: t has 3 occurrences.
*/
