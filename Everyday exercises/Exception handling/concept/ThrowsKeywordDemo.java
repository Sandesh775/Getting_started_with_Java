import java.util.Scanner;
public class ThrowsKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age : ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        }
        catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
        System.out.println("Throws keyword demo done ! Program continues");
    }
    public static void checkAge(int age) throws IllegalArgumentException{
        if(age<=0){
            throw new IllegalArgumentException("Age can't be negative or 0 !");
        }
        System.out.println("Age : "+age);
    }
}