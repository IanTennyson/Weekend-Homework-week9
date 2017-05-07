package example.codeclan.com.shoppingbasketcodetest;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Objectable;

/**
 * Created by user on 07/05/2017.
 */

public class Customer {
    private boolean hasCard;
    private Objectable[] hand;

    public Customer(Boolean hasCard){
        this.hasCard =hasCard;
        this.hand = new Objectable[1];
    }

    public int anythingInHand(){
            if(hand != null){
               return 0;
            }
        return 1;
        }


}
