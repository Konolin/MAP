package org.example.ex2;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private static final int THREAD_COUNT = 4;

    public static int computeSum(List<Integer> numbers) throws InterruptedException {
        List<Thread> sumThreads = new ArrayList<>();
        int chunkSize = numbers.size() / THREAD_COUNT;
        int start, end = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            start = i * chunkSize;
            end = chunkSize;
            if (i == THREAD_COUNT - 1) {
                end = THREAD_COUNT;
            }
            sumThreads.add(new SumCalculator(numbers, start, end));
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            sumThreads.get(i).start();
        }

        int sum = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            sumThreads.get(i).join();
            sum += ((SumCalculator) sumThreads.get(i)).getSum();
        }

        return sum;
    }

    public static int computeMax(List<Integer> numbers) throws InterruptedException {
        List<Thread> maxThreads = new ArrayList<>();
        int chunkSize = numbers.size() / THREAD_COUNT;
        int start, end = 0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            start = i * chunkSize;
            end = Math.min((i + 1) * chunkSize, numbers.size());
            maxThreads.add(new MaxCalculator(numbers, start, end));
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            maxThreads.get(i).start();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < THREAD_COUNT; i++) {
            maxThreads.get(i).join();
            int current = ((MaxCalculator) maxThreads.get(i)).getMax();
            if (max < current) {
                max = current;
            }
        }

        return max;
    }
}
