//Exercise 1: Reference Copying
//Create a class Person with a name field. Create two reference variables p1 and p2.
// Make p1 point to a new Person object with name "Alice". Make p2 point to the same object as p1.
// Then change the name through p2 to "Bob". What is the name when accessed through p1? Why?

public class Exercise1 {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 ;
        p2 = p1;
        p2.name = "Bob";// change through p2
        System.out.println("After changing : ");
        System.out.println(p1.name);// accessed through p1
        // Because both reference variable are pointing to the same object !
    }
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
    Person(Person obj){
        this.name = obj.name;
    }
}