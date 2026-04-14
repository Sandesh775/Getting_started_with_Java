import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number only : ");

        try {
            int num = sc.nextInt();  //If user enters "hello" or any other format other than integer
            System.out.println("You entered: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid number!");
        }

        sc.close();
    }
}