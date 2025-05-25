package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SILab2Test {

    @Test
    public void testAllItemsNull() {
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(null, "1234567890123456"));
        assertEquals("allItems list can't be null!", ex.getMessage());
    }

    @Test
    public void testItemNameNull() {
        List<Item> items = List.of(new Item(null, 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, "1234567890123456"));
        assertEquals("Invalid item!", ex.getMessage());
    }

    @Test
    public void testSuccessfulExecution() {
        List<Item> items = List.of(new Item("BigVKing", 11, 350, 0.1));
        double result = SILab2.checkCart(items, "1234567890123456");
        // 350 * 0.9 = 315 * 11 = 3465, then -30 penalty
        assertEquals(3435.0, result);
    }

    @Test
    public void testCardNumberInvalidCharacters() {
        List<Item> items = List.of(new Item("Item1", 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, "12345678901234AB"));
        assertEquals("Invalid character in card number!", ex.getMessage());
    }

    @Test
    public void testCardNumberWrongLength() {
        List<Item> items = List.of(new Item("Item1", 1, 100, 0));
        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items, "1234567890123"));
        assertEquals("Invalid card number!", ex.getMessage());
    }

    @Test
    public void testTXXCondition() {
        List<Item> items = List.of(new Item("Vlahe", 0, 310, 0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, null));
    }

    @Test
    public void testFTXCondition() {
        List<Item> items = List.of(new Item("Vladimir", 1, 100, 0.1));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, null));
    }

    @Test
    public void testFFFCondition() {
        List<Item> items = List.of(new Item("Tasevski", 1, 100, 0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, null));
    }

    @Test
    public void testFFTCondition() {
        List<Item> items = List.of(new Item("Shaco", 11, 100, 0));
        assertThrows(RuntimeException.class, () -> SILab2.checkCart(items, null));
    }
}
