public class CallerUseThrows {
        public static void divide(int a, int b) throws ArithmeticException {
            if(b == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            System.out.println("Result: " + (a / b));
        }

        // This method also throws — doesn't handle, just passes up
        public static void calculate() throws ArithmeticException {
            divide(10, 0);  // No try-catch here!
        }

        public static void main(String[] args) {
            try {
                calculate();  // Finally handled here
            } catch (ArithmeticException e) {
                System.out.println("Caught: " + e.getMessage());
            }
        }
    }