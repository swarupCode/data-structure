package com.dsa.arrays;

public class Prob015_SubArrayDiff {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6,2,4,6,8,7,1,7,9,10};
        int sumDiff = getDiff(nums);
        System.out.println();
        System.out.println(sumDiff);
    }

    private static int getDiff(int[] nums) {
        int max = 0;
        int l = nums[0], r = 0;
        for (int i=1; i< nums.length; i++) {
            if (nums[i-1] < nums[i]) {
                r = nums[i];
                max = Math.max(max, (r-1));
                System.out.print(max + " ");
            } else {
                l = nums[i];
                r = nums[i];
            }
        }
        return max;
    }
}
