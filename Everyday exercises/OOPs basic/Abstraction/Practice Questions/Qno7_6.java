/*
* Write a java class to implement concept of abstract class and abstract methods.*/
public class Qno7_6 {
    public static void main(String[] args) {
        Shape1 s = new Circle("Red", 5);
        s.getColor();
        s.area1();
    }
}
abstract class Shape1{
    String color;
    Shape1(String color){
        this.color = color;
    }
    // abstract method
    public abstract void area1();
    // Concrete method
    void getColor() {
        System.out.println("Color: " + color);
    }
}
class Circle extends Shape1{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    public void area1() {
        System.out.println("Area: " +(3.14*radius*radius));
    }
}