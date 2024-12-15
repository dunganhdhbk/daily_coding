package com.dungtda.day3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {


    @Test
    void testRemoveDuplicate() {
        int[] nums = {1, 1, 1, 2, 2,  3};

        int result = RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums);

        System.out.printf("nums = %s\n", Arrays.toString(nums));
        assertEquals(5, result);

    }
}