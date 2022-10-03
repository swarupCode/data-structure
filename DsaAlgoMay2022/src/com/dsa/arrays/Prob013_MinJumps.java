package com.dsa.arrays;

public class Prob013_MinJumps {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 2, 4, 2, 0, 1, 1};
        System.out.println(minJumps(arr));
    }

    static int minJumps(int[] arr){
        // your code here
        int i=0, jumps = 0;
        while(i < arr.length) {

            if(arr[i] == 0) i++;
            else {
                i = arr[i]+i-1;
                jumps ++;
            }
            if(i>arr.length) break;
        }
        return jumps;
    }
}
