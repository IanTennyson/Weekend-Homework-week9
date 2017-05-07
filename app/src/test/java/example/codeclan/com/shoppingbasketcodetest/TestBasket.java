package example.codeclan.com.shoppingbasketcodetest;

import android.content.Context;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;

/**
 * Created by user on 05/05/2017.
 */

public class TestBasket {

    Basket basket;
    Food food1;
    Food food2;
    Food food3;
    Food food4;

    @Before
    public void before(){
        basket = new Basket();
        food1 = new Food("Eggs", 2, 10.0, false);
        food2 = new Food("Milk", 4, 10.0, true);
        food3 = new Food("Bread", 2, 10.0, false);
        food4 = new Food("Soup", 5, 10.0, true);
        basket.addToBasket(food1);
        basket.addToBasket(food2);
        basket.addToBasket(food3);
    }

    @Test
    public void testFoodHasBeenAddedToBasket(){
        assertEquals(3, basket.size());
    }

    @Test
    public void testCanRemoveSpecificItem(){
        basket.remove(food3);
        assertEquals(2, basket.size());
    }

    @Test
    public void testCanEmptyBasket(){
        basket.empty();
        assertEquals(0, basket.size());
    }

    @Test
    public void testTotalCostOfBasketBeforeDisc(){
        assertEquals(80.0, basket.totalCostBeforeDiscount());
    }

    @Test
    public void testEvenBogofHasBeenReduced(){
        assertEquals(60.0, basket.checkBogof());
    }

    @Test
    public void testOddBogofHasBeenReduced(){
        basket.addToBasket(food4);
        assertEquals(90.0, basket.checkBogof());
    }

    @Test
    public void  testPriceHasBeenReducedByTenPercent(){
        assertEquals(54.0, basket.checkTenPercent());
    }

}
