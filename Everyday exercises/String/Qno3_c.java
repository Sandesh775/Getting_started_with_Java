/*
* 3. Write a program to demonstrate following string related function
a. Character extraction function (charAt(), getChars(), toCharArray())
b. String Comparison function (equals(), equalsIgnoreCase(), CompareTo() )
c. Modifying string function (substring(), concat(), replace())
*/
public class Qno3_c {
    public static void main(String[] args) {
        String text = "hello world";
        System.out.println(text.substring(0,5));
        System.out.println(text.substring(6));//(6, up to last index )

        String firstName = "John";
        String lastName = " Doe";
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        String original = "I love C++";
        String replaced = original.replace("C++","Java");
        System.out.println("Replaced : "+replaced);
        System.out.println("Original : "+original);
    }
}