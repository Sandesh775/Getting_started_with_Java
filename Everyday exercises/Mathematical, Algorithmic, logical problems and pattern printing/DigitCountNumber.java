import java.util.Scanner;
public class DigitCountNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int number = sc.nextInt();
        int count = 0;
        int digit = 0;
        int temp = number;
        while( temp > 0){
            count ++;
            temp = temp/10;
        }
        System.out.println("Digit count in number : "+count);
        System.out.println("Extracting number from Right to left using maths logic: ");
        for(int i = 1; i <= count; i++){
            digit = number % 10;
            System.out.print(digit+"\t");
            number = number / 10;
        }
    }
}