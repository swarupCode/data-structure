package com.dsa.arrays;

import java.util.Arrays;

public class Prob008_Reverse {
    public static void main(String[] args) {
        int[] arr = {9,2,3,4,5};
        reverse(arr, 0, arr.length-1);
        for (Integer i : arr)
            System.out.print(i +" ");
    }

    private static void reverse(int[] arr, int l, int r) {
        if(l>=r) {
            return;
        }
        swap(arr, l, r);
        reverse(arr, l+1, r-1);
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
