// basic code to reverse input string without using string builder !
import java.util.Scanner;
public class ReverseString{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String string = sc.nextLine();
        // converting String into array of characters 
        System.out.println("Original string : "+string);
        System.out.println("string length: "+string.length());
        char [] chars = string.toCharArray();
        System.out.println("Reverse string : ");
        for(int i = (string.length()-1); i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}