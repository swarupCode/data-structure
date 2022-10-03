package com.dsa.arrays;

import java.util.Stack;

public class Prob004_II_StockBuySell {

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
//        int arr[] = {1,2,3,4,5};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {

        int sum = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                sum +=prices[i]-prices[i-1];
            }

        }
        return sum;
    }
}
