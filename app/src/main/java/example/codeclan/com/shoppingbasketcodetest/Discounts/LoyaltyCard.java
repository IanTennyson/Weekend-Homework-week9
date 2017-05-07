package example.codeclan.com.shoppingbasketcodetest.Discounts;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Discountable;


/**
 * Created by user on 07/05/2017.
 */

public class LoyaltyCard implements Discountable {

    public Double discount(Double priceBeforeDiscounts, Boolean hasLoyalty){
        if(hasLoyalty){
            Double onePercent = priceBeforeDiscounts / 100;
            Double twoPercent = onePercent * 2;
            return priceBeforeDiscounts - twoPercent;
        }
        return priceBeforeDiscounts;
    }

}
