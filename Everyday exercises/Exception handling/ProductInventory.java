// Create custom exceptions:
// - NegativePriceException (price < 0)
// - OutOfStockException (quantity = 0)
// - InvalidProductCodeException (code format wrong)
//
// Methods: validatePrice(), checkStock(), validateCode()
// Main: Test with invalid product data
public class ProductInventory {
    public static void main(String[] args) {

        // Test 1: Negative Price
        System.out.println("=== Test 1: Negative Price ===");
        try {
            validatePrice(-100);
        } catch (NegativePriceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Out of Stock
        System.out.println("\n=== Test 2: Out of Stock ===");
        try {
            checkStock(0);  // quantity = 0 means out of stock
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Invalid Product Code
        System.out.println("\n=== Test 3: Invalid Product Code ===");
        try {
            validateCode("ABC123");
        } catch (InvalidProductCodeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 4: All Valid
        System.out.println("\n=== Test 4: All Valid ===");
        try {
            validatePrice(500);
            checkStock(10);
            validateCode("PRD-001");
            System.out.println("All validations passed! Product is ready.");
        } catch (NegativePriceException | OutOfStockException | InvalidProductCodeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validatePrice(int price) throws NegativePriceException {
        if(price < 0) {
            throw new NegativePriceException("Price cannot be negative! Got: " + price);
        }
        System.out.println("✓ Price is valid: ₹" + price);
    }

    public static void checkStock(int quantity) throws OutOfStockException {
        if(quantity == 0) {
            throw new OutOfStockException("Product is out of stock! Quantity: " + quantity);
        }
        System.out.println("✓ Product in stock: " + quantity + " units available");
    }

    public static void validateCode(String productCode) throws InvalidProductCodeException {
        // Simple validation: code should start with "PRD-" followed by 3 digits
        if(productCode == null || productCode.length() != 7) {
            throw new InvalidProductCodeException("Invalid code format! Expected format: PRD-001");
        }
        if(!productCode.startsWith("PRD-")) {
            throw new InvalidProductCodeException("Product code must start with 'PRD-'! Got: " + productCode);
        }
        // Check if last 3 characters are digits
        String digits = productCode.substring(4);
        for(char c : digits.toCharArray()) {
            if(!Character.isDigit(c)) {
                throw new InvalidProductCodeException("Product code must end with 3 digits! Got: " + productCode);
            }
        }
        System.out.println("✓ Product code is valid: " + productCode);
    }
}

class NegativePriceException extends Exception {
    NegativePriceException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}

class InvalidProductCodeException extends Exception {
    InvalidProductCodeException(String message) {
        super(message);
    }
}