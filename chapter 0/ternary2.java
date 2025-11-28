/**
 * Find largest numbers among 3 using ternary operator
 * this program shows we can use if-else ladder alternative ternary operator 
 */
import java.util.Scanner;
public class ternary2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers :  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c); // Nested ternary operator use !!!
        System.out.println("Lergest number input : "+largest);
    }
}