public class AbstractDemo {
    public static void main(String[] args) {
        Figure r = new Rectangle1();
        Figure t = new Triangle();
        r.area();
        t.area();
        // due to dynamic method dispatch even if we can't
        // create an object of Abstract classes we can
        // create reference variable of parent type and still
        // do access methods and perform operations
    }
}
abstract class Figure{
    // method
    abstract void area();
}
class Rectangle1 extends Figure{
    void area(){
        System.out.println("L*b is area");
    }
}
class Triangle extends Figure{
    void area(){
        System.out.println("1/2(B*H) is area");
    }
}