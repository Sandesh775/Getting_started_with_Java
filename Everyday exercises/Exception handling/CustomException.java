/*
*  Write a java program that will read balance and withdraw amount from
keyboard and display the remaining balance on screen if the balance is greater
than withdraw amount otherwise throw an exception with appropriate
message.
* */
import java.util.Scanner;
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int withdraw = 0;
        do{
            System.out.println("Current balance : "+balance);
            System.out.println("1.Withdraw\t2.Exit");
            int option = sc.nextInt();
            if(option == 2){
                return;
            } else{
                System.out.println("Now enter amount to be withdrawn : ");
                withdraw = sc.nextInt();
                try {
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println(withdraw+" amount withdrawn successfully !");
                        System.out.println(" ");
                    }
                    else{
                        throw new InSufficientFundException("Insufficient balance!");
                    }
                } catch (InSufficientFundException e) {
                    //System.out.println("Fuel your bank balance : "+e);
                    System.out.println("Fuel your bank balance : "+e.getMessage());
                }
            }
        }while(withdraw > 0 && balance > 0);//while (balance > withdraw);
    }
}
class InSufficientFundException extends RuntimeException {

    private String message;

    public InSufficientFundException(String message) {
        this.message = message;
    }
//    public InSufficientFundException(String message) {
//        super(message);
//    }

    public InSufficientFundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}