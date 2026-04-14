//Validate marks (0-100 range)
import java.util.*;
public class ValidateMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for subject1 : ");
        int marks = sc.nextInt();
        try
        {
            if(marks < 0 || marks > 100){
                throw new IllegalArgumentException("Marks must be valid withing range (0-100)");
            }
            System.out.println("Marks entered for subject1 successfully !");
            System.out.println("Subject1 : "+marks);
        }catch (IllegalArgumentException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}