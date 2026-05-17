/*
* Problem 2: Shape Area Calculator
Create:

Abstract class Shape with abstract method double area()

Classes Circle (radius) and Rectangle (width, height)

Implement area() for both

In main(), create one Circle and one Rectangle

Print area of each

Question after you code: Where is the area() formula stored? In parent or child?
* */
public class ShapeAreaCalculator {
   public static void main(String[] args) {
       Circle c = new Circle(5);
       Rectangle r = new Rectangle(6,9);
       System.out.println(c.area());
       System.out.println(r.area());
    }
}
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // area
    @Override
    public double area(){
        return (3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // area
    @Override
    public double area(){
        return width*height;
    }
}
// Answer : You mean where formula implemented , it is in Child classes obviously, if methods do implemnatation
// then how can we get the essence of Abstraction at all ?