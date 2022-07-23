package com.dsa.stack;

public class StackRunner {
    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();
        stack.push(new Customer("Tom", 31));
        stack.push(new Customer("Dick", 30));
        stack.push(new Customer("Harry", 32));

        stack.pop();
        stack.printList();
    }
}
