package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

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
        item1 = new Item("Eggs", 2, 2.0, false);
        item2 = new Item("Milk", 1, 1.5, true);
        item3 = new Item("Bread", 3, 1.0, false);
    }

}
