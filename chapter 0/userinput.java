import java.util.Scanner;
public class userinput {
    public static void main(String []  args){
        Scanner input = new Scanner(System.in);// here creating object of Scanner and passing parameter inside Scanner()
        System.out.println("Enter a word : ");
        String s1 = input.next();
        input.nextLine();          // <-- consumes leftover newline
        System.out.println("Now enter full sentence here : ");
        String s2 = input.nextLine();
        System.out.println("Input word : "+s1);
        System.out.println("Input sentence : "+s2);
    }
}