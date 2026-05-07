import java.util.*;
public class FibonacciRcursiveIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (to find nth Fibonacci number): ");
        int n = sc.nextInt();
        System.out.println(n+" th number in fibonacci series is : "+fibonacciIterative(n));
        System.out.println(n+" th number in fibonacci series is : "+fibonacciRecursive(n));
    }
    public static long fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }

        long a = 0;  // F(0)
        long b = 1;  // F(1)
        long c = 0;  // F(n)

        for (int i = 2; i <= n; i++) {
            c = a + b;  // Next Fibonacci number
            a = b;      // Shift left
            b = c;      // Update last
        }

        return c;
    }
    public static long fibonacciRecursive(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // Recursive call
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}