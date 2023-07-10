package com.hari.leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {

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

    static public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        BinaryTree.TreeNode root = new BinaryTree.TreeNode(5);
//        tree.insert(root, 2);
//        tree.insert(root, 4);
//        tree.insert(root, 8);
//        tree.insert(root, 6);
//        tree.insert(root, 7);
//        tree.insert(root, 3);
//        tree.insert(root, 9);
//        System.out.println("Traversing tree in order");
//        tree.traverseInOrder(root);
//
//        BinaryTree tree1 = new BinaryTree();
//        BinaryTree.TreeNode root1 = new BinaryTree.TreeNode(3);
//        tree1.insert(root1, 9);
//        tree1.insert(root1, 20);
//        tree1.insert(root1, 15);
//        tree1.insert(root1, 7);
//        System.out.println("Traversing tree in order");
//        tree1.traverseInOrder(root1);
    }
}
