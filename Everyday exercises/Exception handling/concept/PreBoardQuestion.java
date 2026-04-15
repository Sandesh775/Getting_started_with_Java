import java.util.*;
public class PreBoardQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you balance : ");
        int balance = sc.nextInt();
        System.out.println("Now enter amount to withdraw : ");
        int withdraw = sc.nextInt();
        try{
            withdrawBalance(balance,withdraw);
        }catch (ApplicationExceptionInvalidToken e){
            System.out.println("Error : "+e.getMessage());
        } catch (ApplicationExceptionInsufficientAmount e) {
            System.out.println("Error : "+e.getMessage());
        }
//        catch (Exception e) {
//            System.out.println("Error : "+e.getMessage());
//        }
    }
    public static void withdrawBalance(int balance,int withdraw) throws ApplicationExceptionInsufficientAmount,ApplicationExceptionInvalidToken{
        if(withdraw<= 0){
            throw new ApplicationExceptionInvalidToken("Invalid token entered ! : "+withdraw);
        }
        if(withdraw>balance){
            throw new ApplicationExceptionInsufficientAmount("Withdrawal amount "+withdraw+" exceeds current balance : "+balance);
        }
        balance -= withdraw;
        System.out.println(withdraw + " withdrawn successfully!");
        System.out.println("Remaining balance: " + balance);
    }
}
class ApplicationExceptionInvalidToken extends Exception{
    ApplicationExceptionInvalidToken(String message){
        super(message);
    }
}
class ApplicationExceptionInsufficientAmount extends Exception{
    ApplicationExceptionInsufficientAmount(String message){
        super(message);
    }
}