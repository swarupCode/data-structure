package com.string;

/*
KADANE'S ALGORITHM
====================
Given an array with + and - numbers, we need to search the greatest subarray sum in O(n) TC.
We traverse the array, and add the elements in sum. If sum is negative we simply make the sum as 0 everytime as
we do not need to carry forward any negative sums.
After getting a positive sum we update the max with the sum,
If anytime sum is more we update the max with sum.

*/

public class String006_LongestSubarrayKadanes {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, 1,-2, 5, 2, -1};
        int result = searchLongestSumArr(arr);
        System.out.println(result);
    }

    private static int searchLongestSumArr(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            sum +=arr[i];
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}
