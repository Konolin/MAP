package Ex2.Main;

public class ArrayProcessor {
    public int maxElem(int[] array) {
        validateArray(array);
        int max = Integer.MIN_VALUE;
        for (int elem : array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public int minElem(int[] array) {
        validateArray(array);
        int min = Integer.MAX_VALUE;
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public int maxSum(int[] array) {
        validateArray(array);
        int sum = arraySum(array);
        int min = minElem(array);
        return sum - min;
    }

    public int minSum(int[] array) {
        validateArray(array);
        int sum = arraySum(array);
        int max = maxElem(array);
        return sum - max;
    }

    public int arraySum(int[] array) {
        validateArray(array);
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    private void validateArray(int[] array) {
        if (array.length == 0) {
            throw new RuntimeException("Array can't be empty");
        }
    }
}
