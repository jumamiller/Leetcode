package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        // Build the hash table
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }

        // Find the complement
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            System.out.println("target: " + target + " nums[i]: " + nums[i] + " complement:" + complement + " i: " + i + " numMap.get(complement): " + numMap.get(complement) + " numMap.containsKey(complement): " + numMap.containsKey(complement) + " numMap.get(complement) != i: " + numMap.get(complement) + " != " + i + " = " + (numMap.get(complement) != i) );
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }

        return new int[]{}; // No solution found
    }
}
