package com.string;

public class String003_Pallindrome {
    public static void main(String[] args) {
        if(isPalindrome("a_*b_a"))
            System.out.println("Pallindrome!");
        else
            System.out.println("NON Pallindrome!!");
    }
    public static boolean isPalindrome(String s) {
        // remove all special characters + toLowercase
        String new_string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(new_string);

        //create a char array of string
        char[] str = new_string.toCharArray();

        //folding the array in half
        for(int i = 0; i<str.length/2; i++) {
            if(str[i] != str[str.length-i-1])
                return false;
        }
        return true;
    }
}
