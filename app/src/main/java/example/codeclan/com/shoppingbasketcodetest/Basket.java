package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 05/05/2017.
 */

public class Basket {
    private ArrayList<Item> basket;

    public Basket(){
        basket = new ArrayList<>();
    }

    public void addToBasket(Item item){
        basket.add(item);
    }

    public int size(){
        return basket.size();
    }

    public void empty(){
        basket.clear();
    }

    public void remove(Item item) {
        basket.remove(item);
    }
}
