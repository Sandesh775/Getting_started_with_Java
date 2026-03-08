package RecursionExamples;
// program to find nth fibonacci number//
// 1 1 2 3 5 8.....
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth position to print fibonacci number of that position: ");
        int n = sc.nextInt();
        int output = fibonacci(n);
        if(output < 0){
            System.out.println("Can't process negative integers !");
            return;
        }
        System.out.println(fibonacci(n));
    }
//    public static int fibonacci(int n){
//        if( n < 2){
//            return n;
//        }
//        return fibonacci(n-1)+fibonacci(n-2);
//    }
public static int fibonacci(int n){
    if( n >= 3){
        return fibonacci(n-1)+fibonacci(n-2);
    }
    else {
        return 1; // first and second number is both 1
    }
    }
}