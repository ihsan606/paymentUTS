package classes.calculators;

public class DiscountPriceTwoMillion extends  PriceCalculator{
    @Override
    public int countGrandTotal(int total) {
        if(total > 2000000){
            return  total - total * 20/100;
        }

        return total;
    }
}
