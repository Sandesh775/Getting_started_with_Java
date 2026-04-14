import java.util.*;
public class ValidateBankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentBalance = 50000;
        int withdrawalAmount;
        System.out.println("Available balance : "+currentBalance);
        System.out.println("Now enter amount to be withdrawn : ");
        withdrawalAmount = sc.nextInt();
        try{
            if(withdrawalAmount <= 0){
                throw new Exception("Amount can't be negative or 0");
            }
            if(withdrawalAmount > currentBalance){
                throw new IllegalArgumentException("Withdrawal amount shouldn't exceed available balance ! \nInsufficient balance! Available: "+currentBalance);
            }
            currentBalance -= withdrawalAmount;
            System.out.println("Amount : "+withdrawalAmount+" has been withdrawn successfully");
            System.out.println("Remaining: " + currentBalance);
        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        //System.out.println("Current balance after transaction : "+(currentBalance-withdrawalAmount));
    }
}