package org.example;

import java.util.ArrayList;
import java.util.List;

public class SingletonMain {
    private final static int NUMBER_THREADS = 50;

    public static void main(String[] args) {
        List<Thread> singletonThreads = new ArrayList<>();

        for (int i = 0; i < NUMBER_THREADS; i++) {
            Thread singleton = new Thread(() -> System.out.println(Singleton.getInstance()));
            singletonThreads.add(singleton);
        }

        for (int i = 0; i < NUMBER_THREADS; i++) {
            singletonThreads.get(i).start();
        }
    }
}
