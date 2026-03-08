// Demo of Multi level inheritance
public class Qno7_2b {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Child have bank balance from grandfather and father is "+c.bank_balance);
    }
}
class Grandfather{
    int bank_balance = 1000000;
}
class Father extends Grandfather{

}
class Child extends Father{

}