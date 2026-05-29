package FactoryDesignPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        String type = "Circle";
        ShapeFactory shapeFactory = new twoD();
        Shape shape = shapeFactory.createShape(type);
        shape.create();
    }
}