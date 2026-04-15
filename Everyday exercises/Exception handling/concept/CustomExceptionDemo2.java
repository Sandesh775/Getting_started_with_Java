import java.util.Scanner;
public class CustomExceptionDemo2 {// Custom exception
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark : ");
        int marks = sc.nextInt();
        try {
            validateMarks(marks);
        }catch (Exception e){
            System.out.println("Error caught : "+e.getMessage());
        }
    }
    public static void validateMarks(int marks) throws OutOfRangeException{
        if(marks < 0 || marks > 100){
            throw new OutOfRangeException("Marks " + marks + " is out of range!");
        }
        System.out.println("Valid marks: " + marks);
    }
}
class OutOfRangeException extends Exception{
    OutOfRangeException(String message){
        super(message);
    }
}