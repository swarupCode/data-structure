package com.dsa.arrays;

import java.util.Stack;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



        Example 1:

        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
        Example 2:

        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.

*/
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

    public int maxProfit2(int[] prices) {
        int diff = 0;
        int max = 0;
        for (int i=prices.length-1; i>=0; i--) {
            max = Math.max(prices[i], max);
            diff = Math.max(max-prices[i], diff);
        }
        return diff;
    }
}
