package com.dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kThLargestElement {
    public static void main(String[] args) {
        int[] arr = {20, 10, 60, 30, 50, 55, 40};
        int k = 3;
        int result = kthLargestElement(arr, k);
        System.out.println(result);



    }

    private static int kthLargestElement(int[] arr, int k) {
        // by default minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if(k > arr.length) return -1;

        for (int i=0; i<k; i++) {
            pq.add(arr[i]);
        }
        for (int i=k; i<arr.length; i++) {
            if(pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.poll();
    }
}
