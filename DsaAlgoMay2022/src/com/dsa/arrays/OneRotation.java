package com.dsa.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OneRotation {
    public static void main(String[] args) {
        OneRotation rotation = new OneRotation();
        int arr[] = {1,2,3,4,5};
        rotation.rotate1(arr, 5);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public void rotate(int arr[], int n)
    {
        int result[] = new int[n];
        result[0] = arr[n-1];
        for(int i=0;i<n-1;i++) {
            result[i+1] = arr[i];
        }
        for(int i=0;i<n;i++) {
            arr[i] = result[i];
        }
    }
    // 1,2,3,4,5
    public void rotate1(int arr[], int n)
    {
        int temp = arr[n-1];
        for (int i = 0; i<n; i++){
            int temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
    }
}
