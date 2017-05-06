package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {
    private ArrayList<Item> basket;

    public Basket(){
        basket = new ArrayList<>();
    }

    public void addToBasket(Food item){
        basket.add(item);
    }

    public int size(){
        return basket.size();
    }

    public void remove(Food item) {
        basket.remove(item);
    }

    public void empty(){
        basket.clear();
    }


    public double totalCostBeforeDis() {
        for (int i = 0; i < basket.size(); i++){
            double totalCostBeforeDiscount = 0.0;
            for (Item item : basket) {

                Food food = (Food) item;
                totalCostBeforeDiscount += food.getPrice();
            }
            return totalCostBeforeDiscount;
        }
        return 0.0;
    }


}

//    @Test
//    public void canThrowUpChicken(){
//        bear.eat(chicken);
//        bear.eat(human);
//        Edible food = bear.throwUp();
//        Chicken original = (Chicken) food;
//        assertEquals("Cluck Cluck", original.cluck());
//    }
