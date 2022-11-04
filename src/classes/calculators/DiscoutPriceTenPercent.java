package classes.calculators;

public class DiscoutPriceTenPercent extends PriceCalculator {
    @Override
    public int countGrandTotal(int total) {
        return total - total * 10/100;
    }
}
