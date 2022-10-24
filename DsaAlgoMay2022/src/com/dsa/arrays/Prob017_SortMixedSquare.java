package com.dsa.arrays;

import com.dsa.util.Utility;

import java.util.Arrays;

public class Prob017_SortMixedSquare {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] arr1 = {-7,-3,2,3,11};
        int[] arr2 = {-5,-3,-2,-1};
        int[] result = sortSquares(arr2);
        System.out.println(Arrays.toString(result));

    }

    private static int[] sortSquares(int[] arr) {
        int N = arr.length;
        int[] result = new int[N];
        int l=0, r=N-1;
        int count = r;

        while (l <= r) {
            if (Math.abs(arr[l]) > Math.abs(arr[r])) {
                Utility.swap(arr,l,r);
            }
            result[r] = arr[r] * arr[r];
            r--;
        }

        return result;
    }
}
