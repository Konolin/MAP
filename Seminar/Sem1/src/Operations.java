public class Operations {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        double result = 0;
        for (int i = 0; i < b; i++) {
            result = add(result, a);
        }
        return result;
    }

    public boolean isPerfect(int a) {
        int sumDiv = 0;
        for(int d = 1; d <= a / 2; d++) {
            if (a % d == 0) {
                sumDiv += d;
            }
        }
        return sumDiv == a;
    }
}
