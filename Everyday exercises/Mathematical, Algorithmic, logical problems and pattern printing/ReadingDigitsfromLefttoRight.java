import java.util.Scanner;
public class ReadingDigitsfromLefttoRight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        String s = Integer.toString(num);// int to string
        char [] arr = new char[s.length()];
        // converting String into array of characters 
        for(int i = 0; i< s.length(); i++){
            arr[i] = s.charAt(i);
            System.out.print(arr[i]+"\t");
        }
    }
}
/**
 * for(int i = 0; i<number.length(); i++){
            arr[i] = number.charAt(i);
        }
        // fetching characters one by one from left to right using for-each loop 
        for(char ch : arr){
            System.out.print(ch+"\t");
        }
 */