// Validate mobile number (must be 10 digits)
import java.util.Scanner;
public class ValidateMobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number : ");
        String number = sc.next();
        try {
            if(number.length() != 10){
                throw new IllegalArgumentException("Valid number  should of length 10");
            }
            System.out.println("Valid mobile number  : "+number);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
