package com.dsa.linkedlist;

import java.util.LinkedList;

public class LinkedListImpl<E> {
    private static class Node<E> {
        private E data;
        private Node next;

        Node(E data) {
            this.data = data;
        }
        Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

    }

    public void add(E data) {
        Node<E> newNode = new Node(data, null);
        Node temp = head;
        if(head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printMidElement() {
        Node prev = head;
        Node curr = head;
        while (curr.next != null && curr.next.next != null) {
            prev = prev.next;
            curr = curr.next.next;
        }
        System.out.println("\nMiddle element is : "+prev.data);
    }

    public void deleteHead() {
        Node temp = head;
        if(head != null) {
            head = temp.next;
        }
    }

    public boolean isValueInList(E value) {
        Node temp = head;
        while(temp != null) {
            if(value instanceof String && value.equals(temp.data)) {
                return true;
            } else if(value instanceof Integer && value == temp.data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    public void sortedInsert(int value) {
        Node<Integer> newNode = new Node<Integer>(value);
        Node<Integer> temp = head;
        if(temp==null || temp.data > value) {
            newNode.next = head;
            head = newNode;
            return;
        }
        while(temp != null && (Integer)temp.data < value) {
            if(((Integer)temp.next.data) >= value ) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
    }

    // PROBLEM:: Reverse a List; 1->2->3->4->X  to 4->3->2->1->X
    Node reverseList(Node head)
    {
        // code here
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

//    PROBLEM:: Delete without head pointer
//    Input:
//    N = 4
//    value[] = {10,20,4,30}
//    node = 20
//    Output: 10 4 30
//    Explanation: After deleting 20 from
//    the linked list, we have remaining
//    nodes as 10, 4 and 30.

    void deleteNodeWithoutHeadPtr(Node del)
    {
        // As we cant delete the get the previous node from current node, so we copy the
        // data from the next node to the current node(creating a dummy) and delete the next node.
        System.out.println("Delete Node without head");

        del.data = del.next.data;
        del.next = del.next.next;
    }

    //PROBLEM:: Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        Node temp = head;
        int count = 0;
        while(temp!=null) {
            count ++;
            temp = temp.next;
        }
        if(n > count) {
            return -1;
        }
        temp = head;
        for(int i=0; i<count-n; i++) {
            temp = temp.next;
        }
        return (Integer)temp.data;
    }

    /*Input:
    N = 5
    value[] = {2, 4, 7, 8, 9}
    k = 3
    Output: 8 9 2 4 7
    Explanation:
    Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
    Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
    Rotate 3: 8 -> 9 -> 2 -> 4 -> 7*/
    // PROBLEM:: Rotate a Linked List
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        // add code here
        for(int i=0; i<k; i++) {
            head = oneRoatation(head);
        }
        return head;
    }
    public Node oneRoatation(Node head) {
        Node cacheHead = head;
        Node temp = head;
        if(temp.next != null) {
            head = temp.next;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = cacheHead;
        temp.next.next = null;

        return head;
    }

    /*Input:
    LinkedList: 1->2->2->4->5->6->7->8
    Output: 2 1 4 2 6 5 8 7
    Explanation: After swapping each pair
    considering (1,2), (2, 4), (5, 6).. so
    on as pairs, we get 2, 1, 4, 2, 6, 5, 8, 7 as a new linked list.*/

    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head == null || head.next==null){
            return head;
        }
        Node curr = head;
        Node temp = null;
        Node newHead = head.next;
        while(true) {
            temp = curr.next;
            Node fast = temp.next;
            temp.next = curr;
            if(fast == null || fast.next == null){
                curr.next = fast;
                break;
            }
            curr.next = fast.next;
            curr = fast;

        }
        return newHead;
    }

}
