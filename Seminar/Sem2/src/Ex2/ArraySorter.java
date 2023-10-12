package Ex2;

public class ArraySorter {
    private Sorter sorter;

    public void setSortingStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sortArray(int[] arr) {
        this.sorter.sort(arr);
    }
}
