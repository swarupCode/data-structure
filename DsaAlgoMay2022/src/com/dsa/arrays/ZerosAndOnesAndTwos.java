package com.dsa.arrays;

import java.util.Arrays;

public class ZerosAndOnesAndTwos {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int[] arr1 = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//        sortInefficient(arr);
        sortAndPrint(arr1);
    }

    private static void sortInefficient(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortAndPrint(int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    swap(a, lo, mid);
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    swap(a, mid, hi);
                    hi--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
