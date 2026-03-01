import org.w3c.dom.css.Rect;

/*
* Question 2: Rectangle Comparison System
Create a Rectangle class with:
•	Private variables: length and breadth
•	Constructor for rectangle (length, breadth)
•	Constructor for square (single parameter)
•	Copy constructor
•	Getter methods only (no setters - make it IMMUTABLE)
•	Method calculateArea() and calculatePerimeter() using object's own data
•	Method isSquare() to check if it's a square
•	Method compareArea(Rectangle other) that takes another Rectangle object and returns which has larger area


In main:
1.	Create rectangles: (5,3), (4,4), and a copy of (4,4)
2.	Compare their areas
3.	Try to modify dimensions (shouldn't be possible - see what happens)
Expected Learning: Immutable objects, passing objects as parameters, method interactions
*/
public class Problem2_set1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,3);
        Rectangle r2 = new Rectangle(4);// square, passing just one parameter
        Rectangle r3 = new Rectangle(4,4);
        Rectangle r4 = new Rectangle(r3);// passing obj to make new obj copy of r3
        // comparing r1 and r3
        //Rectangle large_obj = new Rectangle();
        //large_obj = r1.compareArea(r3);
        //System.out.println("Object with larger area between r1 and r3 is : "+large_obj);
//        Rectangle finalobj = new Rectangle(large_obj);
//        int len = finalobj.getLength();
//        int breadth = finalobj.getBreadth();
        Rectangle larger = r2.compareArea(r3);
        int len = larger.getLength();
        int br = larger.getBreadth();
        System.out.println("Rectangle with length : "+len+" breadth : "+br+" has larger area !");
        boolean r2_isSquare = r2.isSquare();
        boolean r1_isSquare = r1.isSquare();
        System.out.println("Is r2 a square : "+r2_isSquare);
        System.out.println("Is r2 a square : "+r1_isSquare);
       //  r1.length = 10; not allowed !!!, it's private and don't have any setter method to change value from outside of class Rectangle
    }
}
class Rectangle{
    private int length;
    private int breadth;
    // default constructor
    Rectangle(){
        this.length = -1;
        this.breadth = -1;
    }
    // constructor for rectangle
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    // constructor for square
    Rectangle( int length){
        this.length = length;
        this.breadth = length;
    }
    // copy constructor for object
    Rectangle(Rectangle obj){
        this.length = obj.length;
        this.breadth = obj.breadth;
    }
    // getters only !
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    // methods to calculate area and perimeter
    public int calculateArea(){
        return length*breadth;// also works for square length * breadth = length
    }
    public int calculatePerimeter(){
        return 2*(length+breadth);
    }
    // method to check if it is square
    public boolean isSquare(){
        if(length == breadth){
            return true;
        }
        return false;
    }
    // method to compare area and return which has largest area
    public Rectangle compareArea(Rectangle other){
        int callingobj_area = this.calculateArea();
        int obj_area = other.calculateArea();
        if(obj_area > callingobj_area){
            return other;
        }
        return this;
    }
}
/*Alternative approach :
public String compareArea(Rectangle other) {
    if (other.calculateArea() > this.calculateArea()) {
        return "Other rectangle is larger";
    }
    return "Calling rectangle is larger";
}
* */
/*
* In Java, variable names like r1 and r3 exist only at the source-code level and are used by the programmer to reference objects.
* Once the program is compiled and running,
*  these variable names do not exist as part of the object itself.
* An object only contains its state (fields) and behavior (methods);
* it has no knowledge of which variable refers to it, how many variables reference it, or what those variables are called.
*  When you print an object using System.out.println(object), Java automatically calls the toString() method.
* If toString() is not overridden in the class, the default implementation from the Object class is used,
* which prints the class name followed by a hash code (for example, Rectangle@6acbcfc0).
* Therefore, if you want meaningful output, you must override the toString() method to display relevant object data,
* or explicitly store an identifier (such as a name field) inside the object.
* This highlights an important object-oriented programming principle: objects represent data and behavior,
* not the variable labels that reference them.*/