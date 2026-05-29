interface Flyable{
    void fly();
    void land();
}
abstract class Bird {
    String name;

    Bird(String name){
        this.name = name;
    }

    void eat(){
        System.out.println(name+" eating");
    }

    abstract void makeSound();
}
// using both abstract class and interface
class Eagle extends Bird implements Flyable{
    Eagle(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("Screech!");
    }
    @Override
    public void fly(){
        System.out.println(name+" soaring high ");
    }
    @Override
    public void land(){
        System.out.println(name+" landing gracefully");
    }
}
class Penguin extends Bird{
    Penguin(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Squawk!");
    }
    // Penguins can't fly, so no Flyable interface
}