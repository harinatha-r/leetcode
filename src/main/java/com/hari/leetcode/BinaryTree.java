package com.hari.leetcode;

public class BinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    static TreeNode root;

//    public static void insert(TreeNode root, int val){
//        BinaryTree.root =insertResursively(BinaryTree.root, val);
//    }

    public void insert(TreeNode node, int value) {
        if (value < node.val) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new TreeNode(value);
            }
        } else if (value > node.val) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                node.right = new TreeNode(value);
            }
        }
    }


    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.val);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(" " + node.val);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(TreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.val);
        }
    }
}
