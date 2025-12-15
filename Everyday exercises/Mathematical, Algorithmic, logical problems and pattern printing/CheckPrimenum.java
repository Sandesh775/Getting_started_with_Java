import java.util.Scanner;
public class CheckPrimenum{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int prime = input.nextInt();
        int a = 1;
        int b = prime;
        if( prime <= 1){
            System.out.println("Not eligible for being prime number ! should be greater than 1");  
            return;      
            }
        boolean isCount = false;
        for(int i = 2; i < prime ; i++){// we are checking if this number is divisible by any number except 1 & number it self
            if( prime % i == 0){        // becasue we have definition that prime number is divisible by 1 and number itself !!
                isCount = true;
                break;
            }
        }
        if(isCount){
                System.out.println("It is not a prime number !");
            }
        else{
                System.out.println("It is a prime number !");
        }
        // if( prime == (a*b)){
            
        // }
        // else{
        //     System.out.println("It is prime number !");
        // }
    }
}
/**
 * int count = 0;
 * for(int i = 1; i <= n; i++){
 *      if( n % i == 0){
 *          count ++;         
 * }
 * if( count >2){
 *      System.out.println("It is not a prime number !");
 * }
 * else{
 *      System.out.println("It is a prime number !");
 * }
 * }
 * if( count == 2){
 *      System.out.println("It is  a prime number !");
 * }
 * else{
 *      System.out.println("It is not a prime number !");
 */