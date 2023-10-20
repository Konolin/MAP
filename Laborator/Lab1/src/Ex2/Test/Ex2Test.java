package Ex2.Test;

import Ex2.Main.ArrayProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex2Test {
    private ArrayProcessor ap;
    private static final String SHOULD_BE_EQUAL = "Should be equal";
    private static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
    private final int[] EMPTY_ARRAY = new int[0];
    private int[] array;

    @BeforeEach
    public void setUp() {
        ap = new ArrayProcessor();
        array = new int[]{0, 5, 1, 53, 23, 15, -14};
    }

    @Test
    public void maxElemTest() {
        assertEquals(53, ap.maxElem(array), SHOULD_BE_EQUAL);
        assertEquals(0, ap.maxElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-10, ap.maxElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.maxElem(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void minElemTest() {
        assertEquals(-14, ap.minElem(array), SHOULD_BE_EQUAL);
        assertEquals(0, ap.minElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-120, ap.minElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.minElem(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void maxSumTest() {
        assertEquals(97, ap.maxSum(array), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.maxSum(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void minSumTest() {
        assertEquals(30, ap.minSum(array), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.minSum(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void arraySumTest() {
        assertEquals(83, ap.arraySum(array), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.arraySum(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }
}
