// Demo of  Hierarchical Inheritance
public class Qno7_2c {
    public static void main(String[] args) {
        Child1 c = new Child1();
        Child2 c1 = new Child2();
        System.out.println("Calling parent method from Child 1");
        c.display();
        System.out.println("Calling parent method from Child 2");
        c1.display();
    }
}
class Parent {
    public void display(){
        System.out.println("In parent class display () method !");
    }
}
class Child1 extends Parent{

}
class Child2 extends Parent{

}