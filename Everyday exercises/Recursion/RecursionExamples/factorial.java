package RecursionExamples;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int n = sc.nextInt();
//        int factorial = findFactorial(n);
        System.out.println("Factorial of "+n+" is : "+findFactorial(n));
    }
    public static int findFactorial(int n){
        if(n >= 1){
            return n * findFactorial(n-1);
        }
        else{
            return 1;
        }
    }
}