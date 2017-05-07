package example.codeclan.com.shoppingbasketcodetest;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

/**
 * Created by user on 07/05/2017.
 */

public class Customer {
    private boolean hasCard;
    private Objectable[] hand;

    public Customer(Boolean hasCard){
        this.hasCard = hasCard;
        this.hand = new Objectable[1];
    }

    public int anythingInHand(){
        int count = 0;
        for (Objectable object : this.hand) {
            if (object != null) {
                count ++;
            }
        }
        return count;
        }

    public void addToHand(Objectable object){
        if (anythingInHand() == 1){
            return;
        }
        int anythingInHand = anythingInHand();
        this.hand[anythingInHand] = object;
    }

    public boolean loyaltyCard(){
        return this.hasCard;
    }
}