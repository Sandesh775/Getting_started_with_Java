import java.util.*;
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter balance : ");
            int balance = sc.nextInt();
            System.out.println("Enter a withdrawal amount : ");
            int withdraw = sc.nextInt();
            try {
                displaybalance(balance,withdraw);
            }catch (InsufficientBalanceException e){
                System.out.println("Application error : "+e.getMessage());
            }finally {
                System.out.println("Transaction completed !");
            }
    }
    public static void displaybalance(int balance, int withdrawal) throws InsufficientBalanceException{
        if(withdrawal>balance || withdrawal<=0){
            throw new InsufficientBalanceException("Insufficient balance! Balance: " + balance + ", Withdrawal: " + withdrawal);
        }
        System.out.println("Remaining balance : "+(balance-withdrawal));
    }
}
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);  // Pass message to parent Exception class
    }
}