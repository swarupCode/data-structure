package com.dsa.stack;

import java.util.Stack;

class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }


    Stack<Integer> stack;
    Stack<Integer> temp;
    public MinStack() {
        stack = new Stack<Integer>();

    }

    public void push(int val) {
        stack.push(val);

    }

    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        temp = new Stack<Integer>();
        int min = Integer.MAX_VALUE;
        while(!stack.isEmpty()) {
            min = Math.min(min, temp.peek());
            stack.pop();
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */