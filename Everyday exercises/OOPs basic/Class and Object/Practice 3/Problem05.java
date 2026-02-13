/*
* Problem 5: Shape Area Calculator (Method Overriding + Polymorphism) 🔺
Topics: Method Overriding, Polymorphism (Using parent reference)
Task: Create:

Parent class Shape with method calculateArea() (prints "Calculating area...")
Child class Circle with radius, override calculateArea() (π × r²)
Child class Rectangle with length, width, override calculateArea() (l × w)
* */
public class Problem05 {
    public static void main(String[] args) {
        Shape c1 = new Circle(6.0);
        Shape r1 = new Rectangle(9, 5);
        Shape [] shapes = {c1,r1};
        for(Shape s : shapes){
            s.calculateArea();
        }
    }
}
class Shape {
    public void calculateArea(){
        System.out.println("Calculating area ....");
    }
}
class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Circle Area : "+(3.14f*r*r));
    }
}
class Rectangle extends Shape{
    int l;
    int b;
    public Rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }
    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Retangle Area : "+(l*b));
    }
}