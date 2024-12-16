package com.dungtda.day5;

public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int startIndex = -1;
        int remainGas = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            if (startIndex != -1) {
                remainGas += gas[i] - cost[i];
                if (remainGas < 0) {
                    startIndex = -1;
                    remainGas = 0;
                }
            }
            if (gas[i] >= cost[i] && startIndex == -1) {
                startIndex = i;
                remainGas = gas[i] - cost[i];
            }
        }
        if (totalGas >= totalCost) {
            return startIndex;
        }
        return -1;
    }
}
