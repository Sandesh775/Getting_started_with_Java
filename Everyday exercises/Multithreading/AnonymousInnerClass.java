public class AnonymousInnerClass {
    static void main() {
//        A obj = new B();
//        obj.print();
        // demo of anonymous inner class
        A obj = new A()
        {
            @Override
            public void print() {
                System.out.println("In anonymous inner class which doesn't have it's name !");
            }
        };
        obj.print();
    }
}
class A{
    public void print(){
        System.out.println("In A class ");
    }
}
class B extends A{
    @Override
    public void print(){
        System.out.println("In B class ");
    }
}