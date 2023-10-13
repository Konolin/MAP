package Ex3.Main;

import java.util.Arrays;

public class NumberProcessor {
    public int[] sum(int[] nr1, int[] nr2) {
        validateNumber(nr1);
        validateNumber(nr2);

        if (nr1[0] == 0 && nr1.length > 1 || nr2[0] == 0 && nr2.length > 1) {
            throw new RuntimeException("Number can't start with 0.");
        }

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
        validateNumber(number);
        int[] result = new int[number.length + 1];
        result[0] = carry;
        for (int i = 0; i < number.length; i++) {
            result[i + 1] = number[i];
        }
        return result;
    }

    public int[] sub(int[] nr1, int[] nr2) {
        validateNumber(nr1);
        validateNumber(nr2);

        if (nr1[0] == 0 && nr1.length > 1 || nr2[0] == 0 && nr2.length > 1) {
            throw new RuntimeException("Number can't start with 0.");
        }

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
        validateNumber(number);

        int j = 0;
        while (number[j] == 0) {
            j++;
        }
        int[] result = new int[number.length - j];
        for (int i = 0; i < result.length; i++) {
            result[i] = number[i + j];
        }
        return result;
    }

    public int[] multiply(int[] number, int digit) {
        validateNumber(number);
        if (digit < 0 || digit > 9) {
            throw new RuntimeException("Input should be a positive digit.");
        }
        if (number[0] == 0 && number.length > 1) {
            throw new RuntimeException("Number can't start with 0.");
        }

        int[] result = new int[number.length];
        int carry = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            int product = number[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }
        if (carry > 0) {
            result = extend(result, carry);
        }
        return result;
    }

    public int[] divide(int[] number, int divisor) {
        validateNumber(number);
        if (divisor == 0) {
            throw new RuntimeException("Can't divide by 0.");
        }
        if (divisor < 0 || divisor > 9) {
            throw new RuntimeException("Input should be a positive digit.");
        }
        if (number[0] == 0 && number.length > 1) {
            throw new RuntimeException("Number can't start with 0.");
        }

        int[] result = new int[number.length];
        int remainder = 0;
        for (int i = 0; i < number.length; i++) {
            int currentDigit = number[i] + remainder * 10;
            result[i] = currentDigit / divisor;
            remainder = currentDigit % divisor;
        }
        if (result[0] == 0) {
            result = makeSmaller(result);
        }
        return result;
    }

    private void validateNumber(int[] number) {
        if (number.length == 0) {
            throw new RuntimeException("Number should not be null.");
        }
        for (int digit : number) {
            if (digit > 9 || digit < 0) {
                throw new RuntimeException("Invalid digit.");
            }
        }
    }
}