package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

/**
 * Created by user on 06/05/2017.
 */

public class Bogof implements Discount{
    private ArrayList<Item> basket;
    private Item item;

    public Bogof(){
        basket = new ArrayList<Item>();
    }

    public Double discount(Double priceBeforeDiscounts) {
        for (Item item : basket) {
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