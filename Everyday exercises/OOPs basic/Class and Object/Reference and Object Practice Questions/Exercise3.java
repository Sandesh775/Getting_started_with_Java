//Exercise 3: Swapping References
//Create a class Person with a name field.
// Write a swap method that takes two Person references and swaps them using a temporary variable.
// In main, create two Person objects with names "X" and "Y". Call the swap method.
// After the method returns, have the names actually swapped? Explain why or why not.
public class Exercise3 {
    public static void main(String[] args) {
        Person2 person = new Person2("Person");
        Person2 X = new Person2("Hari");
        Person2 Y = new Person2("Ram");
        System.out.println("Before swap reference variable X and Y : ");
        System.out.println("X name : "+X.name);
        System.out.println("Y name : "+Y.name);
        person.swap(X,Y);
        System.out.println("After swapping reference variable X and Y : ");
        System.out.println("X name : "+X.name);
        System.out.println("Y name : "+Y.name);
    }
}
class Person2{
    String name;
    Person2(String name){
        this.name = name;
    }
    public void swap(Person2 ref1, Person2 ref2){
        Person2 temp;
        temp = ref1;
        ref1 = ref2;
        ref2 = temp;
    }
}
// Swapping reference variable won't change anything , we are just passing copies