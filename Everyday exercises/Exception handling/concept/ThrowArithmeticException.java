public class ThrowArithmeticException {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            if(b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}