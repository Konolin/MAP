package Ex2.Main;

public class Ex2Main {
    public static void main(String[] args) {
        ArrayProcessor ap = new ArrayProcessor();

        int[] example = new int[]{4, 8, 3, 10, 17};
        System.out.println(ap.minSum(example));
    }
}
