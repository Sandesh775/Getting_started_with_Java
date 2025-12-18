public class AbstractKeyword{
    public static void main(String [] args){
        // we can't create a object of abstract class
        Shape r1 = new Rectangle(5,10);// concept of polymorphism
        r1.displayShape();
        System.out.println("Area of rectangle is : "+r1.calculateArea());
    }
}
abstract class Shape{
         public abstract int calculateArea();// declaring abstract method
         public void displayShape(){
            System.out.println("This is shape !");
         }
}
class Rectangle extends Shape{
        int l;
        int b;
        public Rectangle(int l, int b){
            this.l = l;
            this.b = b;
        }
        public int calculateArea(){// defining method here
            return this.l*this.b;
        }
}