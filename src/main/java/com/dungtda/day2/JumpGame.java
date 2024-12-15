package com.dungtda.day2;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int length = nums.length;
        int currentPosition = 0;
        for (int i = 0; i < length - 1; i++) {
            if (i > currentPosition) {
                return false;
            }
            if (i + nums[i] >= length - 1) {
                return true;
            }
            currentPosition = Math.max(currentPosition, i + nums[i]);
        }
        return false;
    }

    public static boolean canJump2(int[] nums) {
        int target = nums.length -1;
        for (int i = nums.length -2; i >= 0; i--) {
            if (target <= i + nums[i]) {
                target = i;
            }
        }
        return target == 0;
    }
}
