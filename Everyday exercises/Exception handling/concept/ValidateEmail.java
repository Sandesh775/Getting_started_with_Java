import java.util.Scanner;
// Validate email (must contain '@')
public class ValidateEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String mail = sc.next();
        try {
            if(!mail.contains("@")){
                throw new IllegalArgumentException("Valid email should contain '@' character ");
            }
            System.out.println("Valid email : "+mail);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
