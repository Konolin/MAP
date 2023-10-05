import java.sql.Array;
import java.util.LinkedList;
import java.util.Arrays;

public class TempStation {
    private final LinkedList<Integer> list = new LinkedList<>(Arrays.asList(12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12));

    public final double averageTemp() {
        int sum = 0;

        for (int elem : list) {
            sum += elem;
        }

        return (double) sum / this.list.size();
    }

    public final int minTemp() {
        int min = list.get(0);

        for (int elem : list) {
            if (elem < min) {
                min = elem;
            }
        }

        return min;
    }

    public final int maxTemp() {
        int min = list.get(0);

        for (int elem : list) {
            if (elem > min) {
                min = elem;
            }
        }

        return min;
    }

    public final int[] largestTempDiff() {
        int j = 0;
        int max = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int diff = Math.abs(list.get(i) - list.get(i + 1));
            if (diff > max) {
                max = diff;
                j = i;
            }
        }

        return new int[]{list.get(j), list.get(j + 1)};
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            sb.append(i).append(" ").append(list.get(i)).append("\n");
        }
        return sb.toString();
    }
}
