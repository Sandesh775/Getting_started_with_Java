import java.util.Scanner;
public class PrimeNumberuptoN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer : ");
        int n = sc.nextInt();
        System.out.println("Printing prime numbers upto "+n);
        int [] primeNum = new int[n];
        for(int i = 2; i<= n; i++){// ignore / skip 1 becasue it is not prime number \
            for(int j = 2; j < i ; j++){
            if( i % j == 0){        // becasue we have definition that prime number is divisible by 1 and number itself !!
                if( i == 2){
                   primeNum[i] = i; 
                }
            }
            }
            else{
                primeNum[i] = i;
            }
        }
        for(int k = 1; k < n; k++){
            System.out.print(primeNum[k]+"\t");
        }
    }
}
