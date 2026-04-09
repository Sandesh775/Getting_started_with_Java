// Problem 1: Check if number is between 50 and 100
public class Problem1 {
    public static void main(String[] args) {
        int number = 25;
        if(number >= 50 && number <= 100){//if(number > 49 && number < 101){
            System.out.println(number);
            System.out.println("Number is between 50 and 100 ?");
            System.out.println("Output : True ");
        }
        else {
            System.out.println(number);
            System.out.println("Number is between 50 and 100 ?");
            System.out.println("Output : False ");
        }
    }
}