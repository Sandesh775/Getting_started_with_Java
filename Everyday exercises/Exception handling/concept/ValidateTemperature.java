// Validate temperature (-50 to 50 range)
import java.util.*;
public class ValidateTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature : ");
        int temperature  = sc.nextInt();
        try {
            if(temperature<-50 || temperature>51){
                throw new IllegalArgumentException("Temperature range must be (-50 to 50)");
            }
            System.out.println("Valid temperature : "+temperature);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}