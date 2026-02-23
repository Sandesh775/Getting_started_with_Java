public class MethodOverloadingInvalidEG {
    public static void main(String[] args) {
        test1(5);
    }
    public int test1(int num){
        return num;
    }
    public float test1(int num){
        float n = num;
        return n;
    }
//    public void test(float num){
//        System.out.println("Passed integer : one parameter !");
//    }
//    public void test(String s){
//        System.out.println("Passed integer : one parameter !");
//    }
}