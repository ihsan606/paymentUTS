package classes.calculators;

public class NoDiscountPrice extends PriceCalculator{
    @Override
    public int countGrandTotal(int total) {
        return total;
    }
}
