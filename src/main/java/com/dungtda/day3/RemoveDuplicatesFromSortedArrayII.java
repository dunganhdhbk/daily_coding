package com.dungtda.day3;

public class RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        int length = 1;
        int currentIndex = 1;
        int currentNum = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != currentNum || count == 1) {
                count = nums[i] == currentNum ? count + 1 : 1;
                nums[currentIndex] = nums[i];
                currentNum = nums[i];
                currentIndex++;
                length++;
            }
        }
        return length;
    }


}
