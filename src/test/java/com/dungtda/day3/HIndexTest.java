package com.dungtda.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    void testCalHIndex() {
        int[] citations = new int[]{3,0,6,1,5};

        int hIndex = HIndex.hIndex(citations);

        assertEquals(3, hIndex);
    }
}