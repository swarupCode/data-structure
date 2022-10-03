package com.dsa.arrays;

import java.util.HashMap;

public class Prob010_SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {10,15,-5,15,-10,5,10, -1, -4};
        int sum = 5;
        subArraySum(arr, sum);
    }
    private static void subArraySum(int[] arr, int sum) {
        int total = 0;
        int l = 0, r = -1;
        int diff = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            total += arr[i];

            if(total == sum) {
                r = i;
                break;
            }

            if(map.containsKey(total - sum)) {
                if(diff < (i - map.get(total - sum))) {
                    diff = (i - map.get(total - sum));
                    l = map.get(total - sum) + 1;
                    r = i;
                }
            }else {
                map.put(total, i);
            }
        }
        System.out.println("Start index: "+l);
        System.out.println("End index: "+r);
    }
}
