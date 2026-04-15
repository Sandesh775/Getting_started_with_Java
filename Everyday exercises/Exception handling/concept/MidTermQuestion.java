//write a java program that reads a list of numbers from the user (comma-separated).
//Convert the inputs into integers and calculate their sum. Use exception handling to catch
//NumberFormatException for invalid numbers and Display meaningful message for exception.
import java.util.*;

public class MidTermQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of numbers in comma separated form eg : 1,2,3,4 : ");
        String input = sc.nextLine();

        // Store split result
        String[] parts = input.split(",");

        int sum = 0;
        boolean hasError = false;

        // Loop through strings, try-catch inside
        for(String part : parts) {
            try {
                int num = Integer.parseInt(part.trim());  // trim removes spaces
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: '" + part.trim() + "' - Skipping");
                hasError = true;
            }
        }

        System.out.println("Sum of valid numbers: " + sum);

        if(hasError) {
            System.out.println("Note: Some invalid entries were skipped.");
        }

        sc.close();
    }
}