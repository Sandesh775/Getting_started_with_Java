import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :  ");
        int n = sc.nextInt();
        int a ;
        int b ;
        int c ; 
        a = 1;
        b = 2;
        c = a+b;
        System.out.println("FibonacciSeries upto "+n);
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for( int i = 4 ; i <= n; i++){
            System.out.print(c+"\t");
            a = b;
            b = c;
            c = a + b;
        }
    }
}