import java.util.*;
public class ValidatePasswordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password and check it's health : ");
        String password = sc.next();
        try{
            if(password.length()<8){
                throw new IllegalArgumentException("Password length must be of 8 characters or greater ");
            }
            System.out.println("Password accepted...");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}