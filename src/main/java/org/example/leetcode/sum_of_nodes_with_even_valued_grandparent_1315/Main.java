package org.example.leetcode.sum_of_nodes_with_even_valued_grandparent_1315;

public class Main {
    public static void main(String[] args) {

    }

    //O(n)
    static int sumEvenGrandparent(TreeNode root) {
        return calculateSubSum(root, -101, -101);
    }

    static private int calculateSubSum(TreeNode currentNode, int parentValue, int grandParentValue) {
        int subResult = 0;

        if (grandParentValue % 2 == 0) {
            subResult += currentNode.val;
        }
        if (currentNode.left != null) {
            subResult += calculateSubSum(currentNode.left, currentNode.val, parentValue);
        }
        if (currentNode.right != null) {
            subResult += calculateSubSum(currentNode.right, currentNode.val, parentValue);
        }

        return subResult;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

