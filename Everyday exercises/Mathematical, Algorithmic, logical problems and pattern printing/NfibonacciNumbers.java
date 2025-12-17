import java.util.Scanner;
public class NfibonacciNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers you want :  ");
        int n = sc.nextInt();
        int a ;
        int b ;
        int c ; 
        a = 0;
        b = 1;
        System.out.println("Printing n("+n+") numbers/Elements from the Fibonacci series  : ");
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for( int i = 2 ; i <= n; i++){
            c = a + b;
            System.out.print(c+"\t");
            a = b;
            b = c;
        }
    }
}