import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers!");
            return;
        }

        System.out.println("\n=== FACTORIAL OF " + n + " ===");
    }
    // ==================== 1. RECURSIVE METHOD ====================
    public static long factorialRecursive(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }

        // Recursive call
        return n * factorialRecursive(n - 1);
    }

    // ==================== 2. ITERATIVE METHOD ====================
    public static long factorialIterative(int n) {
        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
