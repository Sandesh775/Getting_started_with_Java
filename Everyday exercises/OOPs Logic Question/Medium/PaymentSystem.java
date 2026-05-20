// INTERFACE - Contract (what to do, not how)
interface PaymentProcessor{
    boolean processPayment(double amount);
    String getPaymentMethod();
}
// ABSTRACT CLASS - Partial implementation (common behavior)
abstract class BankPayment implements PaymentProcessor{

    protected String accountNumber;// field

    // constructor
    public BankPayment (String accountNumber){
        this.accountNumber = accountNumber;
    }

    // method : Common behavior for all bank payments
    protected boolean validateAccount(){
        return accountNumber != null && accountNumber.length()>0;
    }

    // overridden methods
    // Force subclasses to implement
    @Override
    public abstract boolean processPayment(double amount);// but still defined it not implemented !

}
// CONCRETE CLASSES
class CreditCardPayment extends BankPayment{

    // constructor
    public CreditCardPayment(String cardNumber){
        super(cardNumber);// passing to parent class
    }

    // only here overridden method got implemented specifically for credit card payment
    @Override
    public boolean processPayment(double amount){
        if(!validateAccount()){
            return false;
        }
        System.out.println("Processing $ "+amount+" via Credit Card : "+accountNumber);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}
class DebitCardPayment extends BankPayment{
    public DebitCardPayment(String cardNumber) {
        super(cardNumber);
    }

    @Override
    public boolean processPayment(double amount){
        if(!validateAccount()){
            return false;
        }
        System.out.println("Processing $ "+amount+" via Debit Card : "+accountNumber);
        return true;
    }

    @Override
    public String getPaymentMethod(){
        return "Debit Card";
    }
}
class CryptoPayment implements PaymentProcessor{
    private String walletAddress;

    public CryptoPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public boolean processPayment(double amount){
        System.out.println("Processing $" + amount + " via Crypto: " + walletAddress);
        return true;
    }

    @Override
    public String getPaymentMethod(){
        return "Cryptocurrency";
    }
}
// USAGE - Polymorphism in action
public class PaymentSystem {
   public static void main(String[] args) {

       PaymentProcessor[] payments = {// array of objects
               new CreditCardPayment("1234-5678"),
               new DebitCardPayment("8765-4321"),
               new CryptoPayment("0xABC123")
       };

       for(PaymentProcessor payment : payments) {
           System.out.println("Method: " + payment.getPaymentMethod());
           payment.processPayment(100.0);
           System.out.println();
       }
    }
}