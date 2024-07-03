package PayMethod;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentType, double amount){
        paymentType.processPayment(amount);
    }
}
