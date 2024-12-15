package com.dungtda.day1;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        // Time O(n); Space O(n)
        if (k <= 0) {
            return;
        }
        int[] rotated = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }

        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }

    public static void rotate2(int[] nums, int k) {
        //Time: O(n), Space O(n)
        if (k <= 0) {
            return;
        }

        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        System.arraycopy(temp, temp.length - k, nums, 0, k);
        System.arraycopy(temp, 0, nums, nums.length - 1 - k, nums.length - k);
    }

    public static void rotate3(int[] nums, int k) {
        //Time O(n); Space O(1)
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }


}
