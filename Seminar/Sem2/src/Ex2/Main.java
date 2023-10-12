package Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 3, 1, 7};

        ArraySorter sorter = new ArraySorter();
        sorter.setSortingStrategy(new SlowSorter());
        sorter.setSortingStrategy(new FastSorter());
        sorter.sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
