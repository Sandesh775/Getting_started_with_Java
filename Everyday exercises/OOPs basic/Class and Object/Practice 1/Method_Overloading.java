public class Method_Overloading {
    public static void main(String[] args) {
        OverloadDemo D1 = new OverloadDemo();
        D1.test();
        D1.test(5);
        System.out.println("Calling test for multiplication of double values : "+D1.test(3.5,5.5));
    }
}
class OverloadDemo{
    void test(){
        System.out.println("NO parameters !");
    }
    void test(int a){
        System.out.println("1 parameter passed !");
    }
    int test(int a, int b){
        return a*b;
    }
    double test(double a, double b){
        return a*b;
    }
}