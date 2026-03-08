/*
*  Create a base class Fruit which has name, taste and size as its attributes. A
method called eat () is created which describes the name of the fruit and its
taste. Inherit the same in 2 other class Apple and Orange and override the
eat () method to represent each fruit taste.
* */
public class Qno7_3 {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Orange o1 = new Orange();
        a1.eat();
        o1.eat();
    }
}
class Fruit{
    String name;
    String taste;
    String size;
    public void eat(){
        System.out.println("Fruit name ......... have it's own taste like ........");
    }
}
class Apple extends Fruit{
    @Override
    public void eat() {
        System.out.println("Apple taste like crisp, juicy, and sweet !");
    }
}
class Orange extends Fruit{
    @Override
    public void eat() {
        System.out.println("Orange taste like sweet and tangy !");
    }
}