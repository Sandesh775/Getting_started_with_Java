//Interface: Payable (processPayment, getReceipt)
//Abstract: OnlinePayment (has transactionId, timestamp)
//Concrete: PayPal, CreditCard, BankTransfer
public interface Payable {
    void processPayment();
    void getReceipt();
}
abstract class OnlinePayment{
    String transactionId;
    String timestamp;

    public OnlinePayment(String transactionId, String timestamp) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
    }
}
class PayPal extends OnlinePayment implements Payable{
    PayPal(String id, String timestamp){
        super(id,timestamp);
    }

    @Override
    public void processPayment(){
        System.out.println("Payment processing via PayPal transcation id : "+transactionId+" time stamp : "+timestamp);
    }

    @Override
    public void getReceipt(){
        System.out.println("Got receipt from payment processed via paypal !");
    }
}
class CreditCard implements Payable{
    @Override
    public void processPayment() {
        System.out.println("Payment via credit card ");
    }

    @Override
    public void getReceipt() {
        System.out.println("Got receipt after payment via credit card ");
    }
}
class BankTransfer extends OnlinePayment implements Payable{
    public BankTransfer(String transactionId, String timestamp) {
        super(transactionId, timestamp);
    }

    @Override
    public void processPayment() {
        System.out.println("Payment via bank transfer..");
    }

    @Override
    public void getReceipt() {
        System.out.println("Got receipt after payment via bank transfer ");
    }
}