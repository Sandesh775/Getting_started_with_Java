import java.util.Scanner;
public class PerfectNumberorNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Factors of "+n+" are : ");
        for(int i = 1; i < n; i++){
            if( n % i == 0){
                sum += i;
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        System.out.println("Sum : "+sum);
        if( sum == n){
            System.out.println("It is perfect number !");
        }
        else{
            System.out.println("It isn't perfect number !");
        }
    }
}