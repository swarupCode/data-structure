package com.dsa.arrays;

public class Prob006_Pallindrome {
    public static void main(String[] args) {
        int[] arr = {2,1,4,1,2};
        boolean flag = isPallindrom(arr, 0, arr.length-1);
        System.out.println(flag ? "It is Pallindrome" : "Not Pallindrome");
    }

    private static boolean isPallindrom(int[] arr, int l, int r) {
        if (l>=r) return true;
        if(arr[l] != arr[r]) return false;
        return isPallindrom(arr, l+1, r-1);
    }

}
