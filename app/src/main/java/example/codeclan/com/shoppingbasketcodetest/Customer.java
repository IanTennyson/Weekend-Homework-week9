package example.codeclan.com.shoppingbasketcodetest;


/**
 * Created by user on 07/05/2017.
 */

public class Customer {
    private boolean hasCard;

    public Customer(Boolean hasCard){
        this.hasCard = hasCard;
    }

    public boolean getHand(){
        return this.hasCard;
    }

}