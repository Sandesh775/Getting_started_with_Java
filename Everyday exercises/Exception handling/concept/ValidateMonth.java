// Validate month (1-12 range)
import java.util.*;
public class ValidateMonth {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a no of month  : ");
            int month  = sc.nextInt();
            try {
                if(month< 1 || month>12){
                    throw new IllegalArgumentException("Valid months are in 1-12 range ");
                }
                System.out.println("Valid month entered "+month);
            }
            catch (IllegalArgumentException e){
                System.out.println(e);
            }
        }
}