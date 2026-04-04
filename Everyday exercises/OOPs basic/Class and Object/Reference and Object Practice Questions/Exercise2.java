//Exercise 2: Method Parameters — Pass by Value
//Create a class Person with a name field. Write two methods:
//        •	One method takes a Person reference and changes the name of that person to "Changed"
//        •	Another method takes a Person reference and assigns it to a new Person object with name "New Person"
//        In main, create a Person with name "Original". Call both methods and print the name after each call.
//        Which method actually changes the original object? Why does the other method not change it?
// modifyPerson() method changes original object, as we know we pass copy of reference not actual reference
// even with copy reference we can reach to object which is pointed by real reference variable
// but changing the object to local or copy of reference variable won't effect to real or actual reference variable
public class Exercise2 {
    public static void main(String[] args) {
        Person1 p = new Person1("Original");
        System.out.println("Before any method: " + p.name);
        // Call modifyPerson() - passes a COPY of the reference
        p.modifyPerson(p);// passing the copy of reference variable
        System.out.println("After change(p): " + p.name);

        // Call reassignPerson() - passes a COPY of the reference
        p.reassignPerson(p);
        System.out.println("After change2(p): " + p.name);

    }
}
class Person1{
    String name;
    Person1(String name){
        this.name =  name;
    }
    // This method modifies the object passed to it
    public void modifyPerson(Person1 ref) {
        ref.name = "Changed";
    }

    // This method tries to reassign the reference
    public void reassignPerson(Person1 obj) {
        obj = new Person1("New Person");
    }
}