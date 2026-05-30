package StrategyPattern;
// Create payment strategy (CreditCard, PayPal, Cash)
interface Payment{
    void paymentProcess();
}
public class PaymentStrategy {
    private Payment type;

    PaymentStrategy(Payment type){
        this.type = type;
    }

    void executePayment() {
        type.paymentProcess();
    }
}
class CreditCard implements Payment{
    public void paymentProcess(){
        System.out.println("Payment process via credit card");
    }
}
class PayPal implements Payment{
    @Override
    public void paymentProcess() {
        System.out.println("Payment process via paypal");
    }
}
class Cash implements Payment{
    @Override
    public void paymentProcess() {
        System.out.println("Payment process via cash");
    }
}