package com.dsa.heap;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // by default minHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // for maxHeap - we pass Comparator
        //PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10);
        pq.add(15);
        pq.add(4);
        pq.add(11);
        System.out.println(pq.size());

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
