package org.example.leetcode.jewels_and_stones_771;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String jew = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jew, stones));
    }

    static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        char[] chars = jewels.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars = jewels.toCharArray();
            set.add(chars[i]);
        }

        char[] array = stones.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if(set.contains(array[i])) {
                count++;
            }
        }
        return count;
    }
}
