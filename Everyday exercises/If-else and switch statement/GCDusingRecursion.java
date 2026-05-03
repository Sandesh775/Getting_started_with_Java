public class GCDusingRecursion {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int min = 0;
        if(num2>num1){
            min = num1;
        }
        else {
            min = num2;
        }
        int gcd = GCD(num1, num2, min);
        System.out.println("HCF or GCD of two numbers : "+num2+ " and "+num1 +" is : "+gcd);
    }
    public static int GCD(int a, int b, int i){
//        if(i > 1){
//            if(a % i == 0 && b % i == 0){
//                return i;
//            }
//            GCD(a,b,i-1);
//        }
//        return 1;
        if (i == 1) {
            return 1;
        }
        if (a % i == 0 && b % i == 0) {
            return i;
        }
        return GCD(a, b, i - 1);
    }
}