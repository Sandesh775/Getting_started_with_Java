import java.util.Scanner;
public class CustomExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int marks = sc.nextInt();
        try{
            if(marks < 0 || marks > 100){
                throw new InvalidMarksException("Marks should be in range (0-100)");
            }
            System.out.println("Valid marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
}
class InvalidMarksException extends Exception{// Custom exception
    InvalidMarksException(String message){
        super(message);
    }
}
// Best optimal way is using throws keyword over method , and have separate methods to handle exception and warn about exception
/*
* // Step 1: Create custom exception class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Step 2: Use it
public class CustomExceptionDemo1 {

    public static void validateMarks(int marks) throws InvalidMarksException {
        if(marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0-100! Got: " + marks);
        }
        System.out.println("Valid marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(150);
        } catch (InvalidMarksException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
* */