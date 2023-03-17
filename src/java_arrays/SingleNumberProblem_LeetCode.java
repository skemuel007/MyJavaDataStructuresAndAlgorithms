package java_arrays;

import java.util.*;
public class SingleNumberProblem_LeetCode {
    /**
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one
     * You must implement a solution with a linear runtime complexity and use only constant extra space
     */

    /**
     * Example 1:
     * Input: nums = [2, 2, 1]
     * Output = 1
     *
     * Example 2:
     * Input: nums = [4, 1, 2, 1, 2]
     * Output = 4
     *
     * Example 3:
     * Input: nums = [1]
     * Output = 1
     */

    public static void main(String[] args) {

    }

    public static int NonBruteForceSolution(int nums[]) {
        // use XOR
        // 4 ^ 4 = 0
        // 2 ^ 2 = 0
        // 3 ^ 0 = 3

        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static int BruteForceSolution(int nums[]) {
        if (nums.length == 1) {
            return nums[1];
        }

        Set<Integer> duplicateCounter = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (duplicateCounter.contains(nums[i]))
                duplicateCounter.remove(nums[i]);
            else
                duplicateCounter.add(nums[i]);
        }

        return duplicateCounter.iterator().next();
    }
}
