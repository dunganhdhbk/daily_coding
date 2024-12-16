package com.dungtda.day4;

import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {

    private final ArrayList<Integer> list;
    private int count;

    public RandomizedSet() {
        list = new ArrayList<>();
        count = 0;
    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        }
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!list.contains(val)) {
            return false;
        }
        list.remove((Integer) val);
        count = 0;
        return true;
    }

    public int getRandom() {
        if (list.isEmpty()) {
            return -1;
        }
        return this.list.get(new Random().nextInt(list.size()) % list.size());
    }
}
