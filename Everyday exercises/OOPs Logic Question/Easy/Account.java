/*
* Build a simple Account class from scratch.
Requirements:
- Fields: accountNumber (String), balance (double), owner (String)
- Constructor that validates: balance cannot be negative,
  accountNumber cannot be null or empty
- deposit(double amount) — validate amount > 0
- withdraw(double amount) — validate amount > 0,
  cannot exceed balance
- getBalance(), getOwner(), getAccountNumber()

Then extend it:
- SavingsAccount extends Account
  - adds interestRate field
  - adds applyInterest() method that increases balance by the rate
  - constructor chains to super

* */
class Account {
    String accountNumber;
    double balance;
    String owner;

    public Account(String accountNumber, double balance, String owner){
        if(accountNumber!=null && !accountNumber.isEmpty()){
            this.accountNumber = accountNumber;
        }
        if(balance>0){
            this.balance = balance;
        }
        this.owner = owner;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getOwner(){
        return owner;
    }
}
class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String accountNumber,double balance,String owner,double interestRate){
        super(accountNumber,balance,owner);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        balance += (interestRate/100.0*balance);
    }
}