// Write a program that does THREE risky operations:
// 1. Divide two numbers (take input)
// 2. Access array index (take input)
// 3. Parse a string to integer (take input)
//
// Use a SINGLE try block and handle each exception separately.
// Use finally block to print "Operation completed".

// Sample Output:
// Enter two numbers: 10 0
// Error: Cannot divide by zero!
// Operation completed
import java.util.*;
public class MultipleCatches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter two input for division : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr = new int[6];
            System.out.println("Division of two numbers : "+a+ " and "+b+" is : "+(a/b));
            System.out.println("Here is array has been created of size 6 so enter index to access it's value : ");
            int index = sc.nextInt();
            System.out.println("Array value at index : "+index+" is : "+arr[index]);
            System.out.println("Enter a string numeric character convert to Integer : ");
            String str = sc.next();
            int num = Integer.parseInt(str);
            System.out.println("String : "+str+" to number done ! valid conversion");
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Operation completed !");
        }
    }
}