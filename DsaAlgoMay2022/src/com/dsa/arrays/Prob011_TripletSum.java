package com.dsa.arrays;

import java.util.Arrays;

public class Prob011_TripletSum {
    public static void main(String[] args) {
        int n = 6, X = 13;
        int A[] = {1, 4,45, 6, 10, 8};
        System.out.println(find3Numbers(A, n, X) ? "Found Triplet" : "Not found!");
    }
    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for (int i=0; i<n-2; i++) {
            int l=i+1, r=n-1;
            while(l<r) {
                if(A[i]+A[l]+A[r] == X) return true;
                if(A[i]+A[l]+A[r] < X) l++;
                else r--;
            }
        }
        return false;
    }
}
