public class MethodOverridingwithCallingtheOverriddenMethod {
    public static void main(String[] args) {
        D obj = new D();
        obj.test();
    }
}
class C{
    public void test(){
        System.out.println("I am at parent class C, you have called me using super.test();");
    }
}
class D extends C{
    @Override
    public void test() {
        super.test();
        System.out.println("And i am at D , because of overriding the method of parent class !");
    }
}