package com.dsa.arrays;

import java.util.Arrays;

/*
CHOCOLATE DISTRIBUTION PROBLEM
==================================
Given an array of n integers where each value represents the number of chocolates in a packet.
Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

    1. Each student gets one packet.
    2. The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates
        given to the students is minimum.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
Output: Minimum Difference is 6
Explanation: The set goes like 3,4,7,9,9 and the output is 9-3 = 6

Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7
Output: Minimum Difference is 10
Explanation: We need to pick 7 packets. We pick 40, 41, 42, 44, 48, 43 and 50 to minimize difference between maximum and minimum.

 */
public class Prob003_ChocolateMin {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
//        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int numOfPackets = arr.length;
        int numOfStudents = 7;
        System.out.println(getMinDifference(arr, numOfStudents, numOfPackets));
    }

    public static int getMinDifference(int[] arr, int m, int n) {
        int minDiff = Integer.MAX_VALUE;

        if (m==0 || n==0) return 0;
        if (n < m) return -1;

        Arrays.sort(arr);

        for (int i=0; i+m-1 < n; i++) {
            int diff = arr[i+m-1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }


        return minDiff;
    }
}
