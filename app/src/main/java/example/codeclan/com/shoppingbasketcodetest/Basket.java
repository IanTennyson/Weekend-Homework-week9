package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

import example.codeclan.com.shoppingbasketcodetest.Discounts.Bogof;
import example.codeclan.com.shoppingbasketcodetest.Discounts.TenPercent;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Itemable;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

/**
 * Created by user on 05/05/2017.
 */

public class Basket implements Objectable {
    private ArrayList<Itemable> basket;
    private TenPercent tenPercent;
    private Bogof bogof;

    public Basket(){
        basket = new ArrayList<Itemable>();
        tenPercent = new TenPercent();
        bogof = new Bogof();
    }

    public ArrayList<Itemable> getItemList(){
        return this.basket;
    }

    public void addToBasket(Itemable item){
        basket.add(item);
    }

    public int size(){
        return basket.size();
    }

    public void remove(Itemable item) {
        basket.remove(item);
    }

    public void empty(){
        basket.clear();
    }


    public Double totalCostBeforeDiscount() {
            double totalCostBeforeDiscount = 0.0;
            for (Itemable item : basket) {
                Food food = (Food) item;
                Double priceByQuantity = food.getPrice() * food.getQuantity();
                totalCostBeforeDiscount += priceByQuantity;
            }
            return totalCostBeforeDiscount;
    }

    public Double checkBogof(){
        Double beforeDis = totalCostBeforeDiscount();
        Double bogofChecked = discount(beforeDis);
        return bogofChecked;
    }

    public Double discount(Double priceBeforeDiscounts) {
            for (Itemable item : Basket.this.getItemList()) {
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

    public Double checkTenPercent(){
        Double beforeDis = checkBogof();
        Double discountCheckedPrice = tenPercent.discount(beforeDis);
        return discountCheckedPrice;
    }

}
