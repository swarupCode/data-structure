package com.dsa.arrays;

import java.util.TreeSet;

public class Prob009_KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int arr1[] = {3,2,3,1,2,4,5,5,6};


        System.out.println(findKthLargest(arr1, 4));
    }
    private static int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            int diff = max - nums[i];

                set.add(diff);

        }
        int c = k-1;
        int result = 0;
        for(Integer val : set) {
            if(c==0) {
                result = (max-val);
                break;
            }
            c--;
        }
        return result;
    }
}
