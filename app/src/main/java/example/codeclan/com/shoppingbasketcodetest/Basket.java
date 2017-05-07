package example.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

import example.codeclan.com.shoppingbasketcodetest.Discounts.Bogof;
import example.codeclan.com.shoppingbasketcodetest.Discounts.LoyaltyCard;
import example.codeclan.com.shoppingbasketcodetest.Discounts.TenPercent;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Itemable;
import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

/**
 * Created by user on 05/05/2017.
 */

public class Basket implements Objectable {
    private ArrayList<Itemable> basket;
    private Boolean card;
    private TenPercent tenPercent;
    private Bogof bogof;
    private LoyaltyCard loyaltyCard;


    public Basket(Boolean card){
        this.card = card;
        basket = new ArrayList<Itemable>();
        tenPercent = new TenPercent();
        bogof = new Bogof();
        loyaltyCard = new LoyaltyCard();
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

    public Boolean getCard(){
        return this.card;
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
        return bogof.discount(beforeDis, this.basket);

    }

    public Double checkTenPercent(){
        Double beforeDis = checkBogof();
        return tenPercent.discount(beforeDis);

    }

    public Double checkLoyaltyDiscount(){
        Double priceAfterAllOtherDiscounts = checkTenPercent();
        Boolean hasLoyalty = this.getCard();
        return loyaltyCard.discount(priceAfterAllOtherDiscounts, hasLoyalty);
    }

}
