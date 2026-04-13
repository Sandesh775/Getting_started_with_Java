import java.util.*;
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int divide = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numerator : ");
        int a = sc.nextInt();
        System.out.println("Enter a denominator : ");
        int b = sc.nextInt();
        try
        {
            divide = a/b;
            //System.out.println("Result divison : "+divide);
        } catch (ArithmeticException e) {
            System.out.println("Error : Cannot divide by zero !");
            //System.out.println("Exception : "+e.getMessage());
            //System.out.println(e);
        }
        System.out.println("Program finished result : "+divide+"\nif result is 0 program gone through exception !");
    }
}