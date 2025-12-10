import java.util.Scanner;
public class ATMpinverificationsystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pin ;
        int correct_pin = 1234;
        int attempts = 4;// it is overall 4 attempts to try let count on first one too ?
        do{
            System.out.print("Enter your 4 digit pin: ");
            pin = sc.nextInt();
            if(pin == correct_pin){
            System.out.println("Transcation Approved!");
            return;     //After return, the program stops executing main() entirely.   
            }
            break;  //break ONLY exits the nearest loop, [ loop stops BUT the program continues with the next line outside the loop ].
        }while(true);// run only once !
        while(attempts>1){// run until attempts / chances get finished 
            attempts--;
            System.out.print("Enter pin again, remaining "+attempts+" attemps only :  ");
            pin = sc.nextInt();
            if(pin == correct_pin){
            System.out.println("Transcation Approved!");
            return;   // <-- exits main() completely
            }
        }
        // If loop ends → attempts finished
        System.out.println("Limit reached. Card blocked! Contact your bank.");
    }
}
// return exits the entire method immediately.
/**Alternative logics : 
 * do{
            if(i>3){
                System.out.println("Limit reached Card blocked. Please contact to your bank !");
                break;
            }
            while(i<=3){
                System.out.print("Enter your 4 digit pin : ");
                pin = sc.nextInt();
                if( (pin) != 1234){
                    i++;
                }
                else{
                    System.out.println("Transcation Approved!");
                    break;
                }
            }
            
        }while( (pin) != 1234);// <-- Java checks this BEFORE running the loop
 */
/**
 * do{
    System.out.print("Enter your 4 digit pin : ");
    pin = sc.nextInt();
    if(pin == 1234){
    System.out.println("Transcation Approved!");
    break;
    }
    while(pin != 1234){
        i--;
        if(i == 0){
           System.out.println("Limit reached Card blocked. Please contact to your bank !");
           break; 
        }
        System.out.print("Enter pin again, "+(i)+" attempts remaining : ");
        pin = sc.nextInt();
        if(pin == 1234){
        System.out.println("Transcation Approved!");
        break;
        }
    }
    }while(pin != 1234);
 */
/**
 * do{
    System.out.print("Enter your 4 digit pin : ");
    pin = sc.nextInt();
    if(pin == correct_pin){
    System.out.println("Transcation Approved!");
    break;
    }
    while(pin != correct_pin){
        attempts--;
        if(attempts == 0){
           System.out.println("Limit reached Card blocked. Please contact to your bank !");
           break; 
        }
        System.out.print("Enter pin again, "+(attempts)+" attempts remaining : ");
        pin = sc.nextInt();
        if(pin == correct_pin){
        System.out.println("Transcation Approved!");
        break;
        }
    }
    }while(attempts > 0);
 */