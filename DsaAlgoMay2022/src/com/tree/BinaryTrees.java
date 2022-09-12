package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int getTotalNumberOfNodes(Node root) {
        if(root == null) return 0;
        return 1 + getTotalNumberOfNodes(root.left) + getTotalNumberOfNodes(root.right);
    }

    public static int getSumOfNodesData(Node root) {
        if(root == null) return 0;
        int sumOfLeftNodes = getSumOfNodesData(root.left);
        int sumOfRightNodes = getSumOfNodesData(root.right);
        return root.data + sumOfLeftNodes + sumOfRightNodes;
    }

    public static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr == null) {
                System.out.println();
                if(queue.isEmpty()) break;
                else queue.add(null);
            } else {
                System.out.print(curr.data + " ");
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);

            }

        }
    }

    public static int getHeightOfTree(Node root) {
        if(root == null) return 0;
        int heightOfLeftTree = getHeightOfTree(root.left);
        int heightOfRightTree = getHeightOfTree(root.right);
        return Math.max(heightOfLeftTree, heightOfRightTree) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree(nodes);
        System.out.println("Root data: "+root.data);
        System.out.println("PREORDER: ");
        preorder(root);
        System.out.println("\nINORDER: ");
        inorder(root);
        System.out.println("\nLEVEL ORDER: ");
        levelOrderTraversal(root);
        System.out.println("\nTotal nodes: "+getTotalNumberOfNodes(root));
        System.out.println("\nSum of nodes: "+getSumOfNodesData(root));
        System.out.println("\nHeight of Tree: "+getHeightOfTree(root));

    }
}
