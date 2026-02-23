public class MethodOverloading {
    public static void main(String[] args) {
        test(9);
        test(9.0);
        test("hello");

    }
    public static void test(int n1){
        System.out.println("One integer parameter !");
    }
    public static void test(double n2){
        System.out.println("Passed double : one parameter !");
    }
    public static void test(String s){
        System.out.println("Passed string : one parameter !");
    }
}