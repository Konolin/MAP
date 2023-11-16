package org.example.ex2;

import java.util.List;

public class SumCalculator extends Thread {
    private List<Integer> numbers;
    private int start, end, sum = 0;

    public SumCalculator(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += numbers.get(i);
        }
    }

    public int getSum() {
        return sum;
    }
}
