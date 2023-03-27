package org.example.leetcode.TreeIteratingAlgo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

    }

//    static int deepestLeavesSum(TreeNode treeNode) {
//        int maxDepthSum = 0;
//        int maxDepth = 0;
//        int currentDepth = 0;
//
//        Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>()
//    }

    //Итеративный обход в глубину
    static int sumDeep(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        int sum = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            sum += node.val;

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return sum;
    }

    //Итеративный обход в ширину
    static int sumWide(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            sum += node.val;

            if (node.right != null) {
                queue.add(node.right);
            }
            if (node.left != null) {
                queue.add(node.left);
            }
        }
        return sum;
    }

    class TreeNode {
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
            this.left = left;
            this.right = right;
        }
    }
}
