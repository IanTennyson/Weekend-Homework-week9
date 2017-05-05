package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by user on 05/05/2017.
 */

public class TestBasket {

    Basket basket;
    Item item1;
    Item item2;
    Item item3;

    @Before
    public void before(){
        basket = new Basket();
        item1 = new Item("Eggs", 2, 1.5, false);
        item2 = new Item("Milk", 1, 2.5, true);
        item3 = new Item("Bread", 3, 1.0, false);
        basket.addToBasket(item1);
        basket.addToBasket(item2);
        basket.addToBasket(item3);
    }

    @Test
    public void testFoodHasBeenAddedToBasket(){
        assertEquals(3, basket.size());
    }

    @Test
    public void testCanRemoveSpecificItem(){
        basket.remove(item3);
        assertEquals(2, basket.size());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.empty();
        assertEquals(0, basket.size());
    }

    @Test
    public void testTotalCostOfBasketBeforeDisc(){
        assertEquals(5.0, basket.totalCostBeforeDis());
    }

}
