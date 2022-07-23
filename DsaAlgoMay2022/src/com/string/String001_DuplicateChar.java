package com.string;

public class String001_DuplicateChar {

    public static void main(String[] args) {
        String s = "poornima";
        boolean isDuplicate = isDuplicateChar(s);
        if(isDuplicate)
            System.out.println("There is a duplicate char");
        else
            System.out.println("UNIQUE String!");
    }

    private static boolean isDuplicateChar(String s) {

        for(int i=0; i<s.length(); i++) {
            int idx = s.indexOf(s.charAt(i), i+1);
            if(idx != -1) return true;
        }
        return false;
    }
}
