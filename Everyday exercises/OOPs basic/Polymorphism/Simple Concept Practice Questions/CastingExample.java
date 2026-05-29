public class CastingExample {
    public static void main(String[] args) {
        //Upcasting (automatic)
        Animal animal1 = new Dog();// Dog -> Animal (upcast)
        // reference type parent -> object of child

        animal1.eat();// works Animal has eat()
      //animal1.bark(); // Error Animal doesn't have bark() !

        // Down casting (manual)
        if(animal1 instanceof Dog){
            Dog dog = (Dog) animal1;// Animal reference type to Dog as reference type (downcast)
            dog.eat();// Dog as child can access all methods and properties of parents !
            dog.bark();
        }

        // Polymorphism in action
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog()
        };

        for(Animal a : animals){
            a.eat();
            // for bark() and meow() can't take risk so check using instanceof
            if(a instanceof Dog){
                ((Dog) a).bark();
            } else if (a instanceof Cat) {
                ((Cat) a).meow();
            }
        }
    }
}
class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barking..");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meowing..");
    }
}