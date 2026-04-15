//Create a custom exception for BankAccount:
//
//InsufficientBalanceException (custom class)
//
//Method withdraw(double amount) throws InsufficientBalanceException
//
//Main method tests with insufficient balance
public class BankAccount {
    static double balance = 100000.0;  // Dynamic balance

    public static void main(String[] args) {
        try {
            withdraw(10000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Cannot withdraw ₹" + amount + ". Available balance: ₹" + balance
            );
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully!");
        System.out.println("Remaining balance: ₹" + balance);
    }
}
class InsufficientBalanceException extends Exception{// custom exception
    InsufficientBalanceException(String message){
        super(message);
    }
}