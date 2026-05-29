package FactoryDesignPattern;
// Create ShapeFactory that creates Circle/Rectangle/Triangle
abstract class ShapeFactory {
    abstract Shape createShape(String type);
}
class twoD extends ShapeFactory{
    @Override
    Shape createShape(String type) {
        if(type.equals("Circle")){
            return new Circle();
        } else if (type.equals("Rectangle")) {
            return new Rectangle();
        } else if (type.equals("Triangle")) {
            return new Triangle();
        }
        else {
            return null;
        }
    }
}
class threeD extends ShapeFactory{
    @Override
    Shape createShape(String type) {
        if(type.equals("Sphere")){
            return new Sphere();
        } else if (type.equals("Cube")) {
            return new Cube();
        }
        else {
            return null;
        }
    }
}
interface Shape{
    void create();
}
class Circle implements Shape{
    @Override
    public void create() {
        System.out.println("Creating Circle shape");
    }
}
class Rectangle implements Shape{
    @Override
    public void create() {
        System.out.println("Creating Rectangle shape");
    }
}
class Triangle implements Shape{
    @Override
    public void create() {
        System.out.println("Creating Triangle shape");
    }
}
class Sphere implements Shape{
    @Override
    public void create() {
        System.out.println("Creating Sphere shape");
    }
}
class Cube implements Shape{
    @Override
    public void create() {
        System.out.println("Creating Cube shape");
    }
}