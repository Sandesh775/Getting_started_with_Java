import java.util.*;
public class AgeException {
    public static void main(String[] args) {
        int ageForVote;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age for vote participation : ");
        ageForVote = sc.nextInt();
        try {
            if(ageForVote<18){
                throw new IllegalArgumentException("Age must be 18 or above");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception : "+e.getMessage());
        }
        finally {
            System.out.println("Age verification done !");
        }
    }
}