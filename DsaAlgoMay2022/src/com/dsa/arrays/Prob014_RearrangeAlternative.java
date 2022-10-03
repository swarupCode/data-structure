package com.dsa.arrays;

public class Prob014_RearrangeAlternative {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6};
        rearrange(arr, arr.length);
    }

    public static void rearrange(long arr[], int n){

        // Your code here
        for(int i=0; i<n; i=i+2) {
            long last = arr[n-1];
            shiftRight(arr, i);
            arr[i] = last;
        }


    }
    public static void shiftRight(long arr[], int index) {

        for(int i=arr.length-1; i>index; i--) {
            arr[i] = arr[i-1];
        }

    }
}
