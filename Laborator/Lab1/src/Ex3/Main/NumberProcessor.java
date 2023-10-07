package Ex3.Main;

public class NumberProcessor {
    public int[] sum(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length];
        int carry = 0;
        for (int i = nr1.length; i >= 0; i--) {
            result[i] = (nr1[i] + nr2[i] + carry) % 10;
            carry = (nr1[i] + nr2[i] + carry) / 10;
        }
        if(carry == 1) {
            result = extend(result);
        }
        return result;
    }

    public int[] extend(int[] number) {
        int[] result = new int[number.length + 1];
        result[0] = 1;
        for(int i = 0; i < number.length; i++) {
            result[i + 1] = number[i];
        }
        return result;
    }
}
