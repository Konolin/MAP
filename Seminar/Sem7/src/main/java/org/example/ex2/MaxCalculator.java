package org.example.ex2;

import java.util.List;

public class MaxCalculator extends Thread {
    private List<Integer> numbers;
    private int start, end;
    private int max = Integer.MIN_VALUE;

    public MaxCalculator(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
    }

    public int getMax() {
        return max;
    }
}
