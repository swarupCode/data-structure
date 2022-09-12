package com.dsa.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,0};
        int[] arr1 = {1,1,0,1,1,0,0};
        sortInefficient(arr);
        sortAndPrint(arr1);
    }

    private static void sortInefficient(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortAndPrint(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

            while(l<r) {
            if(arr[l] == 1 && arr[r] == 0) {
                swap(arr, l, r);
                l++;
                r--;
            } else if(arr[l] == 0 && arr[r] == 0) {
                l++;
            } else if(arr[l] == 1 && arr[r] == 1) {
                r--;
            } else {
                l++;
                r--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
