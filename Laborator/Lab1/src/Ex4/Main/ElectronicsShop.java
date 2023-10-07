package Ex4.Main;

import java.net.Inet4Address;

public class ElectronicsShop {
    public int cheapestItem(int[] itemArray) {
        int min = Integer.MAX_VALUE;
        for (int item : itemArray) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }

    public int mostExpensiveItem(int[] itemArray) {
        int max = Integer.MIN_VALUE;
        for (int item : itemArray) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public int mostExpensiveAndAffordableItem(int[] itemArray, int budget) {
        int max = Integer.MIN_VALUE;
        for (int item : itemArray) {
            if (max < item && item < budget) {
                max = item;
            }
        }
        return max;
    }

    public int bestCombinationPrice(int[] itemArray1, int[] itemArray2, int budget) {
        int maxSum = 0;
        for (int i = 0; i < itemArray1.length; i++) {
            for (int j = 0; j < itemArray2.length; j++) {
                int currentSum = itemArray1[i] + itemArray2[j];
                if (currentSum <= budget && currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        if (maxSum == 0) {
            return -1;
        }
        return maxSum;
    }
}
