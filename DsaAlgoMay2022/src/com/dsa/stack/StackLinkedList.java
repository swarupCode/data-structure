package com.dsa.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackLinkedList {

    LinkedList<Customer> list = new LinkedList<Customer>();

    public void push(Customer customer) {
        list.push(customer);
    }

    public Customer pop() {
        return list.pop();
    }

    public void printList() {
        ListIterator<Customer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
