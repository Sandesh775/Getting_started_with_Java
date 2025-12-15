// revising the concept of switch and ternary operator
import java.util.Scanner;
public class VowelConsonant{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String name = obj.nextLine();
        char ch = name.charAt(0);  // Correct way to access first character , alternative : char ch = Character.toLowerCase(name.charAt(0));
        System.out.println("Now enter your age : ");
        int age = obj.nextInt();
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            switch (Character.toLowerCase(ch)){
            case 'a':/**  This parts works like OR operator,execute the same block of code  */
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Your first name start with vowel letter ! : "+ch);
                break;
            default :
                System.out.println("Your first name start with consonant letter !: "+ch);
            } 
        }
        else{
            System.out.println("Invalid input !!!! Name must start with A-Z or a-z.");
        }
        System.out.println("Voting eligibility : " + 
                ((age>=18)
                ?"You are eligible for voting !"
                :"You are not eligible for voting !")
                          );
        
    }
}