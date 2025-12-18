import java.util.Scanner;
abstract class Payment{
    public abstract void pay(int amount);

}
public class PaymentSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Cash\t2:Card\t3:Wallet");
        System.out.print("Choose through which payment system you want to made payment : ");
        int op = sc.nextInt();
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();
        switch(op){
            case 1:
                Payment c1 = new CashPayment();
                c1.pay(amount);
                return;
            case 2:
                Payment c2 = new CardPayment();
                c2.pay(amount);
                return;
            case 3:
                Payment w3 = new WalletPayment();
                w3.pay(amount);
                return;
            default :
                System.out.println("Invalid operator !");
        }
    }
}
class CashPayment extends Payment{
    public void pay(int amount){
        System.out.println(amount+" Payment done successfully !");
    }
}
class CardPayment extends Payment{
    public void pay(int amount){
        System.out.println(amount+" Payment done successfully !");
    }
}
class WalletPayment extends Payment{
    public void pay(int amount){
        System.out.println(amount+" Payment done successfully !");
    }
}