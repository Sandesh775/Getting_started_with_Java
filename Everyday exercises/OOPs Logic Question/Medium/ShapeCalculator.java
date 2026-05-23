/*
* /**
 * DESIGN REQUIREMENT:
 *
 * Create a shape hierarchy:
 * - All shapes can calculate area and perimeter
 * - 2D shapes (Circle, Rectangle) share common behavior
 * - 3D shapes (Sphere, Cube) extend 2D shapes + add volume
 *
 * YOUR TASK:
 *
 * 1. Create interface: Shape
 *    - double calculateArea()
 *    - double calculatePerimeter()
 *    - String getShapeType()
 *
 * 2. Create abstract class: Shape2D implements Shape
 *    - Provide default perimeter behavior if needed
 *
 * 3. Create concrete 2D classes:
 *    - Circle (radius)
 *    - Rectangle (length, width)
 *    - Triangle (3 sides)
 *
 * 4. Create interface: ThreeDimensional
 *    - double calculateVolume()
 *
 * 5. Create concrete 3D classes:
 *    - Sphere extends Circle implements ThreeDimensional
 *    - Cube extends Rectangle implements ThreeDimensional
 *
 * 6. In main():
 *    - Create 3 2D shapes, calculate area/perimeter
 *    - Create 2 3D shapes, calculate area/perimeter/volume
 *    - Display all in formatted table
 *
 * TIME LIMIT: 70 minutes
 */

// Formulas:
// Circle area: π * r²
// Circle perimeter: 2 * π * r
// Rectangle area: length * width
// Rectangle perimeter: 2 * (length + width)
// Triangle area: Heron's formula or (base * height) / 2
// Triangle perimeter: side1 + side2 + side3
// Sphere volume: (4/3) * π * r³
// Cube volume: side³*/
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] twoDshapes = {
          new Triangle(6,8,10),
          new Rectangle(5,7),
          new Circle(5),
        };
        Shape[] threeDshapes = {
                new Cube(6,6),
                new Sphere(17)
        };
        System.out.println("2D Shape \tArea\tPerimeter");
        for(Shape s : twoDshapes){
            System.out.println(s.getShapeType()+"\t"+s.calculateArea()+"\t"+s.calculatePerimeter());
        }
        System.out.println("3D Shape \tSurface_Area\tCircumference\tVolume");
        for(Shape s : threeDshapes){// ???????
            System.out.println(s.getShapeType()+"\t"+s.calculateArea()+"\t"+s.calculatePerimeter()+"\t"+s.calculateVolume());
        }

    }
}
interface Shape{
    double calculateArea();
    double calculatePerimeter();
    String getShapeType();
}
abstract class TwoDShapes implements Shape {

}
// concrete 2D classes
class Circle extends TwoDShapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (3.14*radius*radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2*3.14*radius);
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }
}
class Rectangle extends TwoDShapes{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (length*width);
    }

    @Override
    public double calculatePerimeter() {
        return 2.0*(length+width);
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
class Triangle extends TwoDShapes{
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return (side1+side2+side3);
    }

    @Override
    public String getShapeType() {
        return "Triangle";
    }
}
interface ThreeDimensional{
    double calculateVolume();
}
class Sphere extends Circle implements ThreeDimensional{

    public Sphere(double radius){
        super(radius);
    }


    @Override
    public double calculateArea() {
        return 4 * Math.PI *getRadius() * getRadius();
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String getShapeType() {
        return "Sphere";
    }

    @Override
    public double calculateVolume() {
        return (4.0/3.0) * 3.14 * Math.pow(getRadius(),3);
    }
}
class Cube extends Rectangle implements ThreeDimensional{

    public Cube(double length, double width) {// we know cube have it's all side equal
        super(length, width);
    }

    @Override
    public double calculateArea() {
        return 6.0*getLength()*getLength();
    }

    @Override
    public double calculatePerimeter() {
        return 12.0*getLength();
    }

    @Override
    public String getShapeType() {
        return "Cube";
    }

    @Override
    public double calculateVolume() {
        return Math.pow(getLength(),3);
    }
}