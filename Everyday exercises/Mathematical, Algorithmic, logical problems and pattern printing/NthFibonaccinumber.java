import java.util.Scanner;
public class NthFibonaccinumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which position (n-th) item of fibonacci series : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int i = 3;
        if(num == 1){
            System.out.println(a);
            return;
        }
        if(num == 2){
            System.out.println(b);
            return;
        }
        while(i <= num){
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(num+"th item in fibonacci series is : "+ c);
    }
}