package classes.payments;

public class Payment {
    PaymentMethod paymentMethod;

    Payment(PaymentMethod pm){
        this.paymentMethod = pm;
    }
    int totalPrice;

    int countGrandTotal(){
        return this.totalPrice;
    }


}
