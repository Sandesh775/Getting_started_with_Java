public class Example1 {
    public static void main(String[] args) {
        Figure f = new Figure(1,2);
        Rectangle r = new Rectangle(8,9);
        Triangle t = new Triangle(6,9);
        Figure variable;// here variable is a reference type variable of Figure class !
        variable = f;
        System.out.println("Area is : "+variable.area());
        variable = r;
        System.out.println("Area is : "+variable.area());
        variable = t;
        System.out.println("Area is : "+variable.area());
    }
}
class Figure{
    double dim1;
    double dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 =dim2;
    }
    public double area(){
        System.out.println("Inside Area of plane figure is undefined !");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double dim1, double dim2){// length and breadth for rectangle
        super(dim1, dim2);
    }
    @Override
    public double area() {
        //super.area();
        System.out.println("Inside Area of rectangle is : ");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){// base and height for triangle
        super(a, b);
    }
    @Override
    public double area() {
        //super.area();
        System.out.println("Inside Area of triangle is : ");
        return (dim1+dim2)/2.0;
    }
}