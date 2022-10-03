package com.dsa.arrays;

public class Prob012_MaxSubarrayKadanes {
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }

        return max;
    }
}
