package com.dungtda.day2;

public class JumpGameII {

    public static int jump(int[] nums) {
        int target  = nums.length -1;
        int near = 0;
        int far = 0;
        int steps = 0;

        while (far < target) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            steps++;
        }
        return steps;
    }
}
