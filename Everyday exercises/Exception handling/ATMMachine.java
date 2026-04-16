// Create custom exceptions:
// - NegativeAmountException (withdraw amount < 0)
// - InsufficientFundsException (amount > balance)
// - DailyLimitExceededException (withdraw > 20000)
//
// Method: withdraw(amount, balance, dailyWithdrawn)
// Main: Test all three scenarios
import java.util.*;

public class ATMMachine {
    static int balance = 40000;
    static int DAILY_LIMIT = 20000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        balance = sc.nextInt();
        System.out.println("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();

        try {
            withdraw(withdrawAmount, balance, DAILY_LIMIT);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withdraw(int amount, int balance, int dailyLimit)
            throws NegativeAmountException, InsufficientFundsException, DailyLimitExceededException {

        if(amount <= 0) {
            throw new NegativeAmountException("Amount can't be negative or zero!");
        }
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        }
        if(amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily withdrawal limit is " + dailyLimit);
        }

        balance -= amount;
        System.out.println("Amount: " + amount + " withdrawn successfully!");
        System.out.println("Remaining balance: " + balance);
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String message) {
        super(message);
    }
}
// Alternative version :
/*
* public class ATMMachine {
    static int balance = 40000;
    static int dailyLimit = 20000;
    static int dailyWithdrawn = 0;  // Track how much withdrawn today

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        balance = sc.nextInt();
        System.out.println("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        try {
            withdraw(amount);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (DailyLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void withdraw(int amount)
            throws NegativeAmountException, InsufficientFundsException, DailyLimitExceededException {

        if(amount <= 0) {
            throw new NegativeAmountException("Amount can't be negative or zero!");
        }
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: " + balance);
        }
        if(dailyWithdrawn + amount > dailyLimit) {
            throw new DailyLimitExceededException(
                "Daily limit is " + dailyLimit + ". Already withdrawn: " + dailyWithdrawn
            );
        }

        balance -= amount;
        dailyWithdrawn += amount;
        System.out.println("Amount: " + amount + " withdrawn successfully!");
        System.out.println("Remaining balance: " + balance);
        System.out.println("Today's withdrawals: " + dailyWithdrawn + " / " + dailyLimit);
    }
}
* */