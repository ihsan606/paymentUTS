package classes.customers;

import classes.calculators.PriceCalculator;

public class RegularCustomer extends CustomerLevel{
    public RegularCustomer(String levelName, PriceCalculator priceCalculator) {
        super(levelName, priceCalculator);
    }

}
