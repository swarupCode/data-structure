package com.dsa.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class IsBinaryTreeHeap {

    public static void main(String[] args) throws IOException {
/*        Node tree = new Node(5);
        tree.left = new Node(2);
        tree.right = new Node(3);
        System.out.println(isHeap(tree));

        // [8,7,6,N,N,5,4]

        Node nodeL = new Node(7);


        Node nodeR = new Node(6);
        nodeR.left = new Node(5);
        nodeR.right = new Node(4);

        Node tree1 = new Node(8);
        tree1.left = nodeL;
        tree1.right = nodeR;

        System.out.println(isHeap(tree1));*/

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);


            if (isHeap(root))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static boolean isHeap(Node tree) {
        // code here
        if(tree.left == null && tree.right == null)
            return true;
        if(tree.left == null)
            return false;
        if(tree.right == null && tree.left.data < tree.data)
            return true;
        if(tree.left.data > tree.data || tree.right.data > tree.data) {
            return false;
        }
        if(tree.left.data < tree.data && tree.right.data < tree.data) {
            return isHeap(tree.left) && isHeap(tree.right);
        } else {
            return false;
        }


    }
}
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
