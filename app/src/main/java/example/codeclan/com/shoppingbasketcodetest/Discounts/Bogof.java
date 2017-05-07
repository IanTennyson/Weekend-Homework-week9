package example.codeclan.com.shoppingbasketcodetest.Discounts;

import java.util.ArrayList;

import example.codeclan.com.shoppingbasketcodetest.Food;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Discountable;


/**
 * Created by user on 06/05/2017.
 */

public class Bogof implements Discountable {
    public Double discount(Double priceBeforeDiscounts, ArrayList basket) {
        for (Object item : basket) {
            Food food = (Food) item;
            if (food.getBogof() && food.getQuantity() > 1) {
                if (food.getQuantity() % 2 == 0) {
                    double halfTheQuantity = food.getQuantity() / 2;
                    double HalfOff = halfTheQuantity * food.getPrice();
                    priceBeforeDiscounts = priceBeforeDiscounts - HalfOff;
                } else {
                    double quantityMadeEven = food.getQuantity() - 1;
                    double halfTheQuantity = quantityMadeEven / 2;
                    double HalfOff = halfTheQuantity * food.getPrice();
                    priceBeforeDiscounts = priceBeforeDiscounts - HalfOff;
                }
            }
        }
        return priceBeforeDiscounts;
    }

    }