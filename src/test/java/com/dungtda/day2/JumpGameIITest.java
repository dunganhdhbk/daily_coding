package com.dungtda.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    @Test
    void testJump() {
        int[] nums = new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};

        System.out.println(JumpGameII.jump(nums));
    }
}