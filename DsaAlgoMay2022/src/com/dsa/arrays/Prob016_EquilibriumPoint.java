package com.dsa.arrays;

public class Prob016_EquilibriumPoint {
    public static void main(String[] args) {
        long arr[] = {1,2,1,1,5,2,2,1};
        System.out.println(getEquilibriumPoint(arr));
    }

    private static int getEquilibriumPoint(long[] arr) {
        if(arr.length == 1) return 1;
        if(arr.length == 2) return -1;
        int N = arr.length;
        int l = 0, r = N - 1;
        int l_sum = (int) arr[l++], r_sum = (int) arr[r--];

        while (l<r) {
            if (l_sum < r_sum) {
                l_sum += arr[l++];
            } else if (l_sum > r_sum) {
                r_sum += arr[r--];
            } else {
                l_sum += arr[l++];
                r_sum += arr[r--];
            }
        }
        if(l_sum == r_sum) {
            return l+1;
        }
        return -1;
    }
}
