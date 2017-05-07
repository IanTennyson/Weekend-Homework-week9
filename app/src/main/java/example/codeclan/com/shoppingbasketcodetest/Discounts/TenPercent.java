package example.codeclan.com.shoppingbasketcodetest.Discounts;

import example.codeclan.com.shoppingbasketcodetest.Interfaces.Discountable;

/**
 * Created by user on 06/05/2017.
 */

public class TenPercent implements Discountable {

    public Double discount(Double totalCostBeforeDiscount){
        if (totalCostBeforeDiscount >= 20.0){
            Double onePercent = totalCostBeforeDiscount / 100;
            Double tenPercent = onePercent * 10;
            return totalCostBeforeDiscount - tenPercent;
        }
        return totalCostBeforeDiscount;
    }
}
