package com.dsa.arrays;

import java.util.ArrayList;

public class LongestSubArraySumDivisibleBy {
    public static void main(String[] args) {
        int arr[] = {2,7,6,1,4,5,3};
        int result = subarraySum(arr, 6, 3);
        System.out.println(result);
    }
    static int subarraySum(int[] arr, int n, int s)
    {
        int res = 0;
        int[] temp = arr;
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            int rem = 0;
            sum+=arr[i];
            rem = sum % s;
            temp[i] = rem;
        }
        for (Integer i: temp) {
            System.out.println("Temp: "+i);
        }



        return res;
    }
}
