/*
* Write a java program to create class named Shape. It should contain one
methods, area () that prints area of shape. For this class create two sub class
Triangle and Rectangle and each class should override the parent class
function area (). Create object of Triangle and Rectangle to observe the
polymorphic nature of class.*/
public class Qno7_4 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10,5);// length --> breadth
        Shape s2 = new Triangle(6,12);//  base  --> height
        s1.area();
        s2.area();
    }
}
class Shape{
    int dimension1;
    int dimension2;
    Shape(){// default
        this.dimension1 = 0;
        this.dimension2 = 0;
    }
    Shape(int dim1, int dim2){
        this.dimension1 = dim1;
        this.dimension2 = dim2;
    }
    public void area(){
        System.out.println("Area of shape ...........................");
    }
}
class Triangle extends Shape{
    Triangle(){
        super();
    }
    Triangle(int base, int height){
        super(base,height);
    }
    @Override
    public void area() {
        System.out.println("Area of Triangle is : "+(1.0/2.0*dimension1*dimension2));
    }
}
class Rectangle extends Shape{
    Rectangle(){
        super();
    }
    Rectangle(int length, int breadth){
        super(length,breadth);
    }
    @Override
    public void area() {
        System.out.println("Area of Rectangle is : "+(dimension1*dimension2));
    }
}