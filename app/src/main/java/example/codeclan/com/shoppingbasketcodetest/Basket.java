package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

/**
 * Created by user on 05/05/2017.
 */

public class Basket{
    private ArrayList<Item> basket;
    private TenPercent tenPercent;
    private Bogof bogof;

    public Basket(){
        basket = new ArrayList<>();
        tenPercent = new TenPercent();
        bogof = new Bogof();
    }

    public void addToBasket(Item item){
        basket.add(item);
    }

    public int size(){
        return basket.size();
    }

    public void remove(Item item) {
        basket.remove(item);
    }

    public void empty(){
        basket.clear();
    }


    public Double totalCostBeforeDiscount() {
        for (int i = 0; i < basket.size(); i++){
            double totalCostBeforeDiscount = 0.0;
            for (Item item : basket) {
                Food food = (Food) item;
                Double priceByQuantity = food.getPrice() * food.getQuantity();
                totalCostBeforeDiscount += priceByQuantity;
            }
            return totalCostBeforeDiscount;
        }
        return 0.0;
    }

    public Double checkBogof(){
        Double beforeDis = totalCostBeforeDiscount();
        Double bogofChecked = bogof.discount(beforeDis);
        return bogofChecked;
    }

    public Double checkTenPercent(){
        Double beforeDis = checkBogof();
        Double discountCheckedPrice = tenPercent.discount(beforeDis);
        return discountCheckedPrice;
    }


}
