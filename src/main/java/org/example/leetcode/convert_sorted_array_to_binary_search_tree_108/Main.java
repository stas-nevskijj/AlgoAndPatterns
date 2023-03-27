package org.example.leetcode.convert_sorted_array_to_binary_search_tree_108;

public class Main {
    public static void main(String[] args) {

    }

    // O(n)
    static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode rootNode = buildSubBST(nums, 0, nums.length - 1);
        return rootNode;
    }

    private static TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (end - start) / 2 + start;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1);
        midNode.right = buildSubBST(nums, mid + 1, end);
        return midNode;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
