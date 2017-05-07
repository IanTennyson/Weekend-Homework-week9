package example.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 07/05/2017.
 */

public class TestCustomer {
    Customer customer1;
    Customer customer2;
    Basket basket1;
    Basket basket2;
    Food food1;
    Food food2;

    @Before
    public void before(){
        customer1 = new Customer(true);
        customer2 = new Customer(false);
        basket1 = new Basket();
        basket2 = new Basket();
        food1 = new Food("Eggs", 2, 10.0, false);
        food2 = new Food("Soup", 2, 10.0, false);
        basket1.addToBasket(food1);
        basket2.addToBasket(food2);
        customer1.addToHand(basket1);

    }


    @Test
    public void testNothingInHand(){
        assertEquals(0, customer2.anythingInHand());
    }

    @Test
    public void testAddBasketToHand(){
        assertEquals(1, customer1.anythingInHand());
    }

    @Test
    public void testCustomerCanHaveLoyaltyCard(){
        assertTrue(customer1.loyaltyCard());
        assertFalse(customer2.loyaltyCard());
    }

}
