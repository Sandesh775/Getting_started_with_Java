import java.util.Scanner;
public class PrimeNumberuptoN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any natural number above 1 : ");
        int n = sc.nextInt();
        System.out.println("Printing prime numbers upto "+n);
        boolean isPrime;
        for(int i = 2; i<= n; i++){// ignore / skip 1 becasue it is not prime number \
            isPrime = true;// this is already set for division of n by 1 and n itself, which is all number's possibility
            for(int j = 2; j < i ; j++){
            if( i % j == 0){        //  here is the filter if there is division other then first condition if yes then it isn't prime so boolean set false !
                isPrime = false;    //  we have definition that prime number is divisible by 1 and number itself only 
            }
            }
            if(isPrime){
            System.out.print(i+"\t");
            }
        } 
    }
}