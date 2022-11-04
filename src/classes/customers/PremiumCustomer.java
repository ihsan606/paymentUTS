package classes.customers;

import classes.calculators.PriceCalculator;

public class PremiumCustomer extends CustomerLevel{
    public PremiumCustomer(String levelName, PriceCalculator priceCalculator) {
        super(levelName, priceCalculator);
    }
}
