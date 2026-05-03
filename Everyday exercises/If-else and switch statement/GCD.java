// Write a java program to to find the greatest common divisor of two numbers !
public class GCD {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        int min = 0;
        if(num2>num1){
            min = num1;
        }
        else {
            min = num2;
        }
        for( int i = min; i>= 1; i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("HCF or GCD of two numbers : "+num2+ " and "+num1 +" is : "+i);
                return;
            }
        }
    }
}