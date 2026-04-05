/*
* Problem 2: Create a Rectangle class with length, width, calculateArea(), calculatePerimeter()

Create 5 rectangles in an array

Pattern to learn: Methods that calculate from attributes*/
public class Problem2_Basics {
    public static void main(String[] args) {
        Rectangle [] rectangles = {// array of objects
             new Rectangle(6,7),
             new Rectangle(5,9),
             new Rectangle(8,10),
             new Rectangle(),
             new Rectangle(6,9)
        };
        System.out.println("Area of rectangles in array : ");
        for (int i = 0; i< rectangles.length; i++){
            System.out.println("Area of ["+(i+1)+"] rectangle : "+rectangles[i].calculateArea());
        }
    }
}
class Rectangle{
    private int length;
    private int width;
    Rectangle(){// default
        this.length = 0;
        this.width = 0;
    }
    Rectangle( int length, int width){
        this.length = length;
        this.width = width;
    }
    public int calculateArea(){
        return length*width;
    }
    public int calculatePerimeter(){
        return 2*(length+width);
    }
}