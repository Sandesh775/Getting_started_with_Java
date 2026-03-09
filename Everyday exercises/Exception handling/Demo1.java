import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
                // ========== INITIALIZATION ==========
                Scanner sc = new Scanner(System.in);  // Scanner for user input
                int a, b, c = 0;                      // 'c' initialized to 0, 'a' and 'b' uninitialized
                int[] array = {1, 2, 3, 4, 5};        // Array of size 5 (indices 0-4)
                String validNumber = "123";            // Valid number string
                String invalidNumber = "abc123";       // Invalid number string (contains letters)

                // ========== PART 1: NO EXCEPTION HERE ==========
                // ✅ This works - "123" is a valid number format
                int num1 = Integer.parseInt(validNumber);  // Converts "123" to integer 123
                System.out.println("Valid conversion: " + num1);  // Prints: 123

                // ========== PART 2: GETTING USER INPUT ==========
                System.out.println("Enter value for a : ");
                a = sc.nextInt();  // User enters first number (e.g., 10)

                System.out.println("Enter value for b : ");
                b = sc.nextInt();  // User enters second number (e.g., 0, 2, etc.)

                System.out.println("Array of size 5. Enter index to see value (0-4): ");
                int i = sc.nextInt();  // User enters array index (e.g., 2, 5, etc.)

                // ========== PART 3: TRY BLOCK - MULTIPLE RISKY OPERATIONS ==========
                try {
                    // RISK 1: DIVISION BY ZERO
                    // If b = 0, this line throws ArithmeticException
                    c = a / b;  // Example: a=10, b=0 → ArithmeticException

                    // RISK 2: ARRAY INDEX OUT OF BOUNDS
                    // If i is not between 0-4, this throws ArrayIndexOutOfBoundsException
                    System.out.println("Value at index " + i + ": " + array[i]);

                    // RISK 3: NUMBER FORMAT EXCEPTION
                    // "abc123" cannot be converted to integer
                    // This line will ALWAYS throw NumberFormatException because invalidNumber is "abc123"
                    int num2 = Integer.parseInt(invalidNumber);
                    System.out.println("This line never executes if exception occurs above");

                }
                // ========== PART 4: CATCH BLOCKS ==========

                // CATCH 1: Handles division by zero
                catch (ArithmeticException e) {
                    System.out.println("❌ ArithmeticException: Invalid division by zero!");
                    // This executes when b = 0
                    // 'c' remains 0 (its initialized value)
                }

                // CATCH 2: Handles invalid array index
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("❌ ArrayIndexOutOfBoundsException: Array size is 5 (indices 0-4 only)!");
                    // This executes when user enters index > 4 or < 0
                    // Example: i = 5 or i = -1
                }

                // CATCH 3: Handles invalid string to number conversion
                catch (NumberFormatException e) {
                    System.out.println("❌ NumberFormatException: Cannot convert '" + invalidNumber + "' to number");
                    System.out.println("   Exception message: " + e.getMessage());
                    // This executes when parseInt() fails
                    // e.getMessage() returns: "For input string: "abc123""
                }

                // CATCH 4: Handles ANY OTHER exception not caught above (generic handler)
                catch (Exception e) {
                    System.out.println("❌ Unknown Exception: " + e.getMessage());
                    // This catches anything not caught by specific catches above
                    // Example: NullPointerException, InputMismatchException, etc.
                }

                // ========== PART 5: CODE AFTER TRY-CATCH ==========
                // This line ALWAYS executes (unless JVM crashes)
                System.out.println("\n=== PROGRAM CONTINUES ===");
                System.out.println("C (result of a/b): " + c);  // Shows 0 if exception occurred

                // Display array information
                System.out.println("\nArray elements (size 5, indices 0-4):");
                for(int k : array) {
                    System.out.print(k + " ");
                }

                // Display string information
                System.out.println("\n\nValid number string: '" + validNumber + "'");
                System.out.println("Invalid number string: '" + invalidNumber + "'");

                // Don't forget to close scanner (good practice)
                sc.close();
    }
}