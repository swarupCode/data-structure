package com.dsa.arrays;

import java.util.HashSet;

public class Prob010_DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
//        System.out.println(findDuplicate(arr));
        System.out.println(containsDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            int idx = Math.abs(nums[i]);
            if(nums[idx] < 0){
                res = Math.abs(nums[i]);
                break;
            }
            nums[idx] = -nums[idx];

        }
        return res;
    }
        public static boolean containsDuplicate(int[] nums) {

            for(int i : nums) {
                HashSet<Integer> set = new HashSet<>();
                if(!set.add(i)) {
                    return true;
                }
            }
            return false;
        }

}
