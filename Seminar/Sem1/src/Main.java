import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ex 1
        Operations op = new Operations();
        System.out.println(op.add(10, 10));
        System.out.println(op.sub(10, 10));
        System.out.println(op.mul(10, 10));

        // ex 2
        System.out.println(StringOperations.reverse("string"));

        // ex 3
        System.out.println(StringOperations.wordCount(" nu  stiu ce   ec  "));

        // ex 4
        System.out.println(op.isPerfect(6));
        System.out.println(op.isPerfect(61));

        // ex 5
        TempStation ts = new TempStation();
        System.out.println(ts.averageTemp());
        System.out.println(Arrays.toString(ts.largestTempDiff()));
        System.out.println(ts);
    }
}