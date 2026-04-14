// Create a program that:
// - Opens a Scanner (simulate with try-catch)
// - Tries to read an integer
// - Closes the Scanner in finally block
// - Print "Scanner closed" in finally

// Focus: Understanding that finally ALWAYS executes
import java.util.*;
public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer;
        System.out.println("Enter a number : ");
        try {
            integer = sc.nextInt();
            System.out.println("Number entered : "+integer);
        }catch (InputMismatchException e){
            System.out.println("Exception : "+e.getMessage());
        }
        finally {
            sc.close();
            System.out.println("Scanner closed");
        }
    }
}