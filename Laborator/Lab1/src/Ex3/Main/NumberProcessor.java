package Ex3.Main;

public class NumberProcessor {
    public int[] sum(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length];
        int carry = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {
            result[i] = (nr1[i] + nr2[i] + carry) % 10;
            carry = (nr1[i] + nr2[i] + carry) / 10;
        }
        if (carry > 0) {
            result = extend(result, carry);
        }
        return result;
    }

    public int[] extend(int[] number, int carry) {
        int[] result = new int[number.length + 1];
        result[0] = carry;
        for (int i = 0; i < number.length; i++) {
            result[i + 1] = number[i];
        }
        return result;
    }

    public int[] sub(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length];
        int carry = 0;
        for (int i = nr1.length - 1; i >= 0; i--) {
            if (nr1[i] >= nr2[i] + carry) {
                result[i] = nr1[i] - nr2[i] - carry;
                carry = 0;
            } else {
                result[i] = 10 + nr1[i] - nr2[i] - carry;
                carry = 1;
            }
        }
        if (result[0] == 0) {
            result = makeSmaller(result);
        }
        return result;
    }

    public int[] makeSmaller(int[] number) {
        int j = 0;
        while (number[j] == 0) {
            j++;
        }
        int[] result = new int[number.length - j];
        for(int i = 0; i < result.length; i++) {
            result[i] = number[i + j];
        }
        return result;
    }

    public int[] multiply(int[] nr, int digit) {
        int[] result = new int[nr.length];
        int carry = 0;
        for (int i = nr.length - 1; i >= 0; i--) {
            int product = nr[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }
        if (carry > 0) {
            result = extend(result, carry);
        }
        return result;
    }

    public int[] divide(int[] nr, int divisor) {
        int[] result = new int[nr.length];
        int remainder = 0;
        for (int i = 0; i < nr.length; i++) {
            int currentDigit = nr[i] + remainder * 10;
            result[i] = currentDigit / divisor;
            remainder = currentDigit % divisor;
        }
        if (result[0] == 0) {
            result = makeSmaller(result);
        }
        return result;
    }
}