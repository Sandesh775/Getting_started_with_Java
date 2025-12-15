import java.util.Scanner;
public class PrimeFactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer above 1 : ");
        int num = sc.nextInt();
        int count  = 0;
        int [] primenumbers = new int[num];
        // first find the prime numbers upto num !
        for(int i = 2; i<= num ; i++){
            for(int j = 2; j < num; j++){
                if( i % j != 0){
                    primenumbers[i]
                }
            }
        }
    }
}
