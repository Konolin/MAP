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

    @BeforeEach
    public void setUp() {
        ap = new ArrayProcessor();
    }

    @Test
    public void maxElemTest() {
        assertEquals(53, ap.maxElem(new int[]{0, 5, 1, 53, 23, 15, -14}), SHOULD_BE_EQUAL);
        assertEquals(0, ap.maxElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-10, ap.maxElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.maxElem(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void minElemTest() {
        assertEquals(-14, ap.minElem(new int[]{0, 5, 1, 53, 23, 15, -14}), SHOULD_BE_EQUAL);
        assertEquals(0, ap.minElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-120, ap.minElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.minElem(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void maxSumTest() {
        assertEquals(39, ap.maxSum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.maxSum(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void minSumTest() {
        assertEquals(25, ap.minSum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.minSum(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void arraySumTest() {
        assertEquals(42, ap.arraySum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> ap.arraySum(new int[0]), SHOULD_THROW_EXCEPTION);
    }
}
