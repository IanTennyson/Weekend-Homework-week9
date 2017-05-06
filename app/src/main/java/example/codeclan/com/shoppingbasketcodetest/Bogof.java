package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

/**
 * Created by user on 06/05/2017.
 */

public class Bogof implements Discount{
    private ArrayList<Item> basket;


    public Double discount(Double priceBeforeDiscounts){
        for (int i = 0; i < basket.size(); i++){
            for (Item item : basket) {
                Food food = (Food) item;
                if (food.getBogof() == true && food.getQuantity() > 1){
                    if(food.getQuantity() % 2 == 0) {
                        double halfTheQuantity = food.getQuantity() / 2;
                        double evenHalfOff = halfTheQuantity * food.getPrice();
                        priceBeforeDiscounts = evenHalfOff -= priceBeforeDiscounts;

                        }
                    else {
                        double oddHalfOff = food.getQuantity() - 1 / 2 * food.getPrice();
                        priceBeforeDiscounts = oddHalfOff -= priceBeforeDiscounts;
                        }
                    }
                }
            }
        return priceBeforeDiscounts;
        }

    }