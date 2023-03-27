package org.example.leetcode.shuffle_array_1470;

public class Main {
    public static void main(String[] args) {

    }

//    O(n)
    static int[] shuffle(int[] nums, int n) {
        int left = 0;
        int right = n;
        int[] result = new int[nums.length];

        for (int i = 1; i < nums.length; i += 2) {
            result[i - 1] = nums[left++];
            result[i] = nums[right++];
        }
        return result;
    }
}
