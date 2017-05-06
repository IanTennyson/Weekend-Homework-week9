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
    Food food1;
    Food food2;
    Food food3;

    @Before
    public void before(){
        basket = new Basket();
        food1 = new Food("Eggs", 1, 10.0, false);
        food2 = new Food("Milk", 2, 5.0, true);
        food3 = new Food("Bread", 1, 5.0, false);
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

//    @Test
//    public void testTotalCostOfBasketBeforeDisc(){
//        assertEquals(20.0, basket.totalCostBeforeDiscount());
//    }

    @Test
    public void testBogofHasBeenReduced(){
        assertEquals(20.0, basket.checkBogof());
    }

//    @Test
//    public void  testPriceHasBeenReducedByTenPercent(){
//        assertEquals(18.0, basket.checkTenPercent());
//    }

}
