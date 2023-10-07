package Ex2.Test;

import Ex2.Main.ArrayProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex2Test {
    private ArrayProcessor ap;
    private static final String SHOULD_BE_EQUAL = "Should be equal";

    @BeforeEach
    public void setUp() {
        ap = new ArrayProcessor();
    }

    @Test
    public void maxTest() {
        assertEquals(53, ap.maxElem(new int[]{0, 5, 1, 53, 23, 15, -14}), SHOULD_BE_EQUAL);
        assertEquals(0, ap.maxElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-10, ap.maxElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
    }

    @Test
    public void minTest() {
        assertEquals(-14, ap.minElem(new int[]{0, 5, 1, 53, 23, 15, -14}), SHOULD_BE_EQUAL);
        assertEquals(0, ap.minElem(new int[]{0, 0, 0, 0}), SHOULD_BE_EQUAL);
        assertEquals(-120, ap.minElem(new int[]{-40, -10, -31, -120}), SHOULD_BE_EQUAL);
    }

    @Test
    public void maxSum() {
        assertEquals(39, ap.maxSum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
    }

    @Test
    public void minSum() {
        assertEquals(25, ap.minSum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
    }

    @Test
    public void arraySum() {
        assertEquals(42, ap.arraySum(new int[]{4, 8, 3, 10, 17}), SHOULD_BE_EQUAL);
    }
}
