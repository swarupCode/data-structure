package com.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        ArrayList list = subarraySum(arr, 6, 5);
        list.stream().forEach(System.out::println);
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        //1,2,3,4,5,6 --> 12(3,4,5)
        boolean flag = false;
        int start=0, last =0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            sum += arr[i];
            if(sum >= s) {
                last = i;
                while (s < sum && start < last) {
                    sum -= arr[start++];
                }
                if(sum == s) {
                    list.add(start + 1);
                    list.add(last + 1);
                    flag = true;
                    break;
                }
            }
        }
        if(!flag) {
            list.add(-1);
        }

        return list;
    }
}
