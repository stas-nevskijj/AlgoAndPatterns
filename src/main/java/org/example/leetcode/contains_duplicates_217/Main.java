package org.example.leetcode.contains_duplicates_217;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //O(2n)
    static boolean containsDuplicateVer2(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!integerSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
