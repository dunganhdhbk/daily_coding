package com.dungtda.day1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > (length / 2)) {
                    return num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return -1;
    }

    public int majorityElementWithMooreVotingAlgorithm(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            System.out.println("Number: " + num);
            if (count == 0) {
                System.out.println("Change candidate: " + candidate + " to " + num);
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            System.out.println("Count: " + count);
        }
        return candidate;
    }
}
