/*
* 3. Write a program to demonstrate following string related function
a. Character extraction function (charAt(), getChars(), toCharArray())
b. String Comparison function (equals(), equalsIgnoreCase(), CompareTo() )
c. Modifying string function (substring(), concat(), replace())
*/
import java.util.Scanner;
public class Qno3_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string : ");
        String word = sc.next();
        String word2 = "";
        for( int i = word.length()-1; i >= 0; i--){
            word2 += word.charAt(i);
        }
        System.out.println("Here using equals() for checking if word is palindrome or not ? ");
        if(word.equals(word2)){
            System.out.println("Word is palindrome !");
        }
        else{
            System.out.println("Word is not palindrome !");
        }
        // equals() - Exact Match (Case-Sensitive)
//        Use when: You need EXACT match including uppercase/lowercase
//        Passwords (usually case-sensitive)
//        IDs, codes
//        Menu options like "Exit" vs "exit"
        String s1 = "Hello";
        String s2 = "HELLO";
        String s3 = "hello";
        System.out.println("Using equalsIgnoreCase() : ");
        System.out.println("Comparing "+s1+" and "+s2+" : "+s1.equalsIgnoreCase(s2));  // true
        System.out.println("Comparing "+s1+" and "+s3+" : "+s1.equalsIgnoreCase(s3));  // true
        // equalsIgnoreCase() -  Match ignoring case
        /*
        * Use when: Case doesn't matter
            Usernames (John = john = JOHN)
            Yes/No inputs ("YES", "Yes", "yes")
            Search functionality
            Commands like "quit", "Quit", "QUIT"*/
        String a = "apple";
        String b = "banana";
        String c = "apple";
        System.out.println("Using compareTo() : ");
        System.out.println("Comparing "+a+" to "+b+" : "+a.compareTo(b));  // negative (a before b)
        System.out.println("Comparing "+b+" to "+a+" : "+b.compareTo(a));  // positive (b after a)
        System.out.println("Comparing "+a+" to "+c+" : "+a.compareTo(c));  // 0 (equal)
        //System.out.println("Apple".compareTo("banana")); // ? -33 ?
        // compareTo() - Dictionary ordering
//        Return values:
//        0 → Strings are equal
//        Negative → First string comes BEFORE second (dictionary order)
//        Positive → First string comes AFTER second
//        Use when:
//        Sorting strings alphabetically
//        Checking if one string is "greater" than another
//        Implementing Comparable interface
// compareTo() returns the ASCII difference of the first mismatched character.
// Negative means first string comes BEFORE second in dictionary order.
    }
}