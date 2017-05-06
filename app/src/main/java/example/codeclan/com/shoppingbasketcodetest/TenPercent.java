package example.codeclan.com.shoppingbasketcodetest;

/**
 * Created by user on 06/05/2017.
 */

public class TenPercent implements Discount {

    public Double discount(Double totalCostBeforeDiscount){
        if (totalCostBeforeDiscount >= 20.0){
            Double onePercent = totalCostBeforeDiscount / 100;
            Double tenPercent = onePercent * 10;
            Double newPrice = totalCostBeforeDiscount - tenPercent;
            return newPrice;
        }
        return totalCostBeforeDiscount;
    }
}
