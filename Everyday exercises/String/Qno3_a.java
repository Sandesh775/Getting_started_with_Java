/*
* Write a program to demonstrate following string related function
a. Character extraction function (charAt(), getChars(), toCharArray())
b. String Comparison function (equals(), equalsIgnoreCase(), CompareTo() )
c. Modifying string function (substring(), concat(), replace())
*/
import java.util.Arrays;
import java.util.Scanner;
public class Qno3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String string = sc.next();
        System.out.println("First character in entered string is : "+string.charAt(0));
        System.out.println("Last character in entered string is : "+string.charAt(string.length()-1));
        System.out.println("Entered word in reversed form : ");
        char [] arr = string.toCharArray();
        for( int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        String string2 = "I love Java";
        char [] chars = new char[4];
        // Copy characters from index 7 to 11-exclusive ("Java") into chars array
        // Parameters: srcBegin, srcEnd, destination, destBegin
        string2.getChars(7,string2.length(),chars,0);
        //srcBegin (start index)	✅ INCLUSIVE (includes this position)
        //srcEnd (end index)	❌ EXCLUSIVE (stops BEFORE this position)
        System.out.println("Second string : "+string2);
        System.out.println("Extracting specific word Java from string2 and storing in array of character chars using getChars():");
        System.out.println(Arrays.toString(chars));
    }
}
