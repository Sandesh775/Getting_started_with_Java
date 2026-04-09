// Problem 2: Count how many digits are even in a number
public class Problem2 {
    public static void main(String[] args) {
        int num = 1234;
        int n = num;
        int count = 0;
        while (n > 0){
            if( (n%10) % 2 == 0){
                count++;
            }
            n = n/10;
        }
        System.out.println(num);
        System.out.println("Output - even count : "+count);
    }
}