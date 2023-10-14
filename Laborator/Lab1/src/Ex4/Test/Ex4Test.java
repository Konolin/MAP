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
    private final int[] CORRECT_ITEMS = new int[]{13, 531, 42, 94, 31};
    private final int[] WRONG_ITEMS = new int[]{13, 531, -42, 94, 31};
    private final int[] EMPTY_ARRAY = new int[0];

    @Before
    public void setup() {
        es = new ElectronicsShop();
    }

    @Test
    public void cheapestItemTest() {
        int result = es.cheapestItem(CORRECT_ITEMS);
        assertEquals(13, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.cheapestItem(WRONG_ITEMS), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.cheapestItem(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void mostExpensiveItemTest() {
        int result = es.mostExpensiveItem(CORRECT_ITEMS);
        assertEquals(531, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveItem(WRONG_ITEMS), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveItem(EMPTY_ARRAY), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void mostExpensiveAndAffordableItemTest() {
        int result = es.mostExpensiveAndAffordableItem(CORRECT_ITEMS, 60);
        assertEquals(42, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveAndAffordableItem(WRONG_ITEMS, 60), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, () -> es.mostExpensiveAndAffordableItem(CORRECT_ITEMS, -40), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void bestCombinationPriceTest() {
        int[] items2 = new int[] {42, 246, 57, 31, 423};
        int result = es.bestCombinationPrice(CORRECT_ITEMS, items2, 155);
        assertEquals(151, result, SHOULD_BE_EQUAL);
        result = es.bestCombinationPrice(CORRECT_ITEMS, items2, 10);
        assertEquals(-1, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, ()-> es.bestCombinationPrice(WRONG_ITEMS, CORRECT_ITEMS, 90), SHOULD_THROW_EXCEPTION);
        assertThrows(RuntimeException.class, ()-> es.bestCombinationPrice(CORRECT_ITEMS, items2, -90), SHOULD_THROW_EXCEPTION);
    }
}
