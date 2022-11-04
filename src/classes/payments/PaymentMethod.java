package classes.payments;

public abstract class PaymentMethod {
    protected abstract String getPaymentDetail();
    protected abstract void createPayment();

}
