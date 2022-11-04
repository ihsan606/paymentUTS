package classes.customers;

import classes.calculators.PriceCalculator;

public class CustomerLevel {
    private String levelName;
    private PriceCalculator priceCalculator;

    public CustomerLevel(String levelName, PriceCalculator priceCalculator) {
        this.levelName = levelName;
        this.priceCalculator = priceCalculator;
    }

    public int countGrandTotal(int t){
        return  this.priceCalculator.countGrandTotal(t);
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public PriceCalculator getPriceCalculator() {
        return priceCalculator;
    }

    public void setPriceCalculator(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }
}
