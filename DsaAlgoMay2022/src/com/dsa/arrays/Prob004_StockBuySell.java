package com.dsa.arrays;

import java.util.Stack;

public class Prob004_StockBuySell {

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit1(arr));
    }
    public static int maxProfit(int[] prices) {
        int arrLen = prices.length;
        int maxProfit = Integer.MIN_VALUE;
        Stack<Integer> stk = new Stack<Integer>();
        if(stk.isEmpty()) {
            stk.push(prices[arrLen-1]);
        }
        for (int i=arrLen-2; i>=0 ;i--) {
            if(prices[i] > stk.peek()) {
                stk.pop();
                stk.push(prices[i]);
            } else {
                int diff = stk.peek() - prices[i];
                maxProfit = Math.max(maxProfit, diff);
            }
        }
        return maxProfit;
    }

    public static int maxProfit1(int[] prices) {
        if (prices.length<=1) return 0;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i]<minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i]-minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
