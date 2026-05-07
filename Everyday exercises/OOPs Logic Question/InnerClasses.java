// Demo of inner class and outer class
public class InnerClasses {
    public static void main(String[] args) {
        // Now see two ways to call or make use of show method !
        Outer obj = new Outer();
        Outer.Inner obj1 = obj.new Inner();
        obj1.show();

        Outer obj2 = new Outer();
        obj2.inner();// indirect !

        Outer.Inner2 obj3 = new Outer.Inner2();
        obj3.config();
    }
}
class Outer{
    private int x;
    class Inner{
        private int y;
        void show(){
            System.out.println("X outer class : "+x+" Y inner class : "+y);
        }
    }
    // creating inner class obj inside outer class :
    void inner(){
        Inner in = new Inner();
        in.show();
    }
    static class Inner2{
        void config(){
            System.out.println("in config static inner class !");
        }
    }
}