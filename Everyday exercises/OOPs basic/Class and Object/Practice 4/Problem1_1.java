/*
* Problem 1: Create a BankAccount class with balance, deposit(), withdraw(), display()
Do this 3 times with different accounts
Pattern to learn: Object holds data, methods change data
* */
public class Problem1_1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(70000);
        b1.deposit(45000);
        BankAccount b2 = new BankAccount(65000);
        b2.withdraw(5000);
        BankAccount b3 = new BankAccount(100000);
        b1.deposit(100000);
        b1.withdraw(34560);
        // displaying information !!!
//        b1.display();
//        b2.display();
//        b3.display();
        BankAccount[] bankAccounts = {b1,b2,b3};
        for(BankAccount b : bankAccounts){
            b.display();
        }
    }
}
class BankAccount{
    private int balance;
    BankAccount(){
        this.balance = 0;
    }
    BankAccount(int balance){
        if(balance < 0) {
            System.out.println("Error: Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        if(amount <= 0){
            System.out.println("Error: Deposit amount must be positive!");
            return;
        }
        this.balance += amount;
        System.out.println("✓ Deposited: $" + amount);
    }
    public void withdraw(int amount){
        if( amount <= 0){
            System.out.println("Amount must be positive : ");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient balance !!");
            return;
        }
        this.balance -= amount;
        System.out.println("✓ Withdrawn: $" + amount);
    }
    public void display(){
        System.out.println("Current balance : "+this.balance);
    }
}