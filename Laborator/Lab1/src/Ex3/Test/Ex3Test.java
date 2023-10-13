package Ex3.Test;

import Ex3.Main.NumberProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex3Test {
    private NumberProcessor np;
    private final static String SHOULD_BE_EQUAL = "Should be equal";
    private final static String SHOULD_THROW_EXCEPTION = "Should throw exception";

    @BeforeEach
    public void setUp() {
        np = new NumberProcessor();
    }

    @Test
    public void sumTest() {
        int[] nr1 = new int[]{1, 3, 0, 0};
        int[] nr2 = new int[]{8, 7, 0, 0};
        int[] result = new int[]{1, 0, 0, 0, 0};
        assertArrayEquals(result, np.sum(nr1, nr2), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> np.sum(nr1, new int[0]), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> np.sum(nr1, new int[]{0, 3}), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> np.sum(nr1, new int[]{3, -3}), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void subTest() {
        int[] nr1 = new int[]{8, 3, 0, 0};
        int[] nr2 = new int[]{7, 4, 0, 0};
        int[] result = new int[]{9, 0, 0};
        assertArrayEquals(result, np.sub(nr1, nr2), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> np.sub(nr1, new int[0]), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> np.sub(nr1, new int[]{0, 3}), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> np.sub(nr1, new int[]{3, -3}), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void divideTest() {
        int[] nr1 = new int[]{2, 3, 6, 0};
        int[] result = new int[]{1, 1, 8, 0};
        assertArrayEquals(result, np.divide(nr1, 2), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, ()-> np.divide(nr1, 0), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, ()-> np.divide(nr1, 10), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, ()-> np.divide(nr1, -4), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void multiplyTest() {
        int[] nr1 = new int[]{2, 3, 6, 0};
        int[] result = new int[]{4, 7, 2, 0};
        assertArrayEquals(result, np.multiply(nr1, 2), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, ()-> np.multiply(nr1, 10), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, ()-> np.multiply(nr1, -4), SHOULD_THROW_EXCEPTION);
    }
}
