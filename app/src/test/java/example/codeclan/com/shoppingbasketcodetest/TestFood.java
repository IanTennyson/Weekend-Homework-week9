package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 05/05/2017.
 */

public class TestFood {

    Food food1;
    Food food2;
    Food food3;

    @Before
    public void before(){
        food1 = new Food("Eggs", 2, 2.0, false);
        food2 = new Food("Milk", 1, 1.5, true);
        food3 = new Food("Bread", 3, 1.0, false);
    }

    @Test
    public void testItemOneName(){
        assertEquals("Eggs", food1.getName());
    }

    @Test
    public void testSetItemOneName(){
        food1.setName("Apples");
        assertEquals("Apples", food1.getName());
    }

    @Test
    public void testItemOneQuantity(){
        assertEquals(2, food1.getQuantity());
    }

    @Test
    public void testSetQuantity(){
        food1.setQuantity(4);
        assertEquals(4, food1.getQuantity());
    }

    @Test
    public void testItemOnePrice(){
        assertEquals(2.0, food1.getPrice());
    }

    @Test
    public void testSetPrice(){
        food1.setPrice(4.0);
        assertEquals(4.0, food1.getPrice());
    }

    @Test
    public void testBOGOF(){
        assertFalse(food1.getBogof());
        assertTrue(food2.getBogof());
    }

}
