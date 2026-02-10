import java.util.Scanner;
public class HideCreditcardNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char[] pin = new char[16];
        System.out.println("Enter credit card number : ");
        for(int i = 0; i < 16; i++){
            pin[i] = sc.next().charAt();
            if(i<15){
                if(pin[i] == enter ){
                    System.out.println("Invalid card number");
                }
            }
        }
        String cardPin = String.valueOf(pin);
        String encodedpin = encode(cardPin);
        System.out.println("Here is your encrypted pin : "+encodedpin);
    }
    public String encode(){
        
    }
}
