package com.recursion;

public class SearchNum {
    public static void main(String[] args) {
        boolean flag = isNumExists(9);
        System.out.println(flag);

    }

    private static boolean isNumExists(int i) {
        if(i < 6) return false;
        if(i == 6) {
            return true;
        }
        return isNumExists(i-1);
    }
}
