import java.util.Random;
import java.util.Scanner;
public class random{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Asked for random numbers (1 for yes/0 for no): ");
        int response = sc.nextInt();
        int randomcatch = (response == 1)? askrandom.give() : 0;
        System.out.println("here is your number champ : "+randomcatch +" if you get 0 because you didn't ask for it bitch !"+"ᶠᶸᶜᵏᵧₒᵤ!");
    }
}
class askrandom{
    public static int give(){
        Random r = new Random();
        int num = r.nextInt(100) + 1; // We want 1 to 100, not 0 to 99
        return num;
    }
}