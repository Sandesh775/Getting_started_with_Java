import java.util.Scanner;
public class ValidateUser {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter user name : ");
            String name = sc.next();
            System.out.println("Enter user age  : ");
            int age = sc.nextInt();
            try {
                checkUser(age,name);
            }
            catch (IllegalArgumentException e){
                System.out.println("Age Error : "+e.getMessage());
            }
            catch (NullPointerException e){
                System.out.println("Name error : "+e);
            }
            System.out.println("Throws keyword demo done ! Program continues");
        }
        public static void checkUser(int age,String name) throws IllegalArgumentException,NullPointerException{
            if(age<=0){
                throw new IllegalArgumentException("Age can't be negative or 0 !");
            }
            if(name == null){
                throw new NullPointerException("Name shouldn't be empty !");
            }
            System.out.println("Valid User info : ");
            System.out.println("Name : "+name+ " Age : "+age);
        }
}