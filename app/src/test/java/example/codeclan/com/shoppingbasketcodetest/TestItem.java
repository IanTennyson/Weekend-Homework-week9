package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 05/05/2017.
 */

public class TestItem {

    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){
        item1 = new Item("Eggs", 2, 2.0, false);
        item2 = new Item("Milk", 1, 1.5, true);
        item3 = new Item("Bread", 3, 1.0, false);
    }

    @Test
    public void testItemOneName(){
        assertEquals("Eggs", item1.getName());
    }

    @Test
    public void testSetItemOneName(){
        item1.setName("Apples");
        assertEquals("Apples", item1.getName());
    }

    @Test
    public void testItemOneQuantity(){
        assertEquals(2, item1.getQuantity());
    }

    @Test
    public void testSetQuantity(){
        item1.setQuantity(4);
        assertEquals(4, item1.getQuantity());
    }

    @Test
    public void testItemOnePrice(){
        assertEquals(2.0, item1.getPrice());
    }

    @Test
    public void testSetPrice(){
        item1.setPrice(4.0);
        assertEquals(4.0, item1.getPrice());
    }

    @Test
    public void testBOGOF(){
        assertFalse(item1.getBogof());
        assertTrue(item2.getBogof());
    }

}
