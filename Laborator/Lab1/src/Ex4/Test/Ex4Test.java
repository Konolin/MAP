package Ex4.Test;

import Ex4.Main.ElectronicsShop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex4Test {
    private ElectronicsShop es;
    private final static String SHOULD_BE_EQUAL = "Should be equal";
    private final static String SHOULD_THROW_EXCEPTION = "Should throw an exception";
    private int[] items;
    private int[] wrong;

    @Before
    public void setup() {
        es = new ElectronicsShop();
        items = new int[]{13, 531, 42, 94, 31};
        wrong = new int[]{13, 531, -42, 94, 31};
    }

    @Test
    public void cheapestItemTest() {
        int result = es.cheapestItem(items);
        assertEquals(13, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.cheapestItem(wrong), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.cheapestItem(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void mostExpensiveItemTest() {
        int result = es.mostExpensiveItem(items);
        assertEquals(531, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveItem(wrong), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveItem(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void mostExpensiveAndAffordableItemTest() {
        int result = es.mostExpensiveAndAffordableItem(items, 60);
        assertEquals(42, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveAndAffordableItem(wrong, 60), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveAndAffordableItem(items, -40), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void bestCombinationPriceTest() {
        int[] items2 = new int[] {42, 246, 57, 31, 423};
        int result = es.bestCombinationPrice(items, items2, 155);
        assertEquals(151, result, SHOULD_BE_EQUAL);
        result = es.bestCombinationPrice(items, items2, 10);
        assertEquals(-1, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, ()-> es.bestCombinationPrice(wrong, items, 90), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, ()-> es.bestCombinationPrice(items, items2, -90), SHOULD_THROW_EXCEPTION);
    }
}
