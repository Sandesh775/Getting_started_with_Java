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

* Add a CurrentAccount class that extends Account.

Requirements:
- adds overdraftLimit (double) field
- constructor chains to super, validates overdraftLimit >= 0
- override withdraw() so that it allows
  withdrawal up to (balance + overdraftLimit)
  but throws if it would exceed that
- add getOverdraftLimit() getter

Test it mentally:
  balance = 1000, overdraftLimit = 500
  withdraw(1400) → should succeed (uses overdraft)
  withdraw(1600) → should throw
* */
class Account {
    private String accountNumber;
    private double balance;
    private String owner;

    public Account(String accountNumber, double balance, String owner){

        if(accountNumber==null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("Account number cannot be null be or empty ");
        }
        if(balance<0){
            throw new IllegalArgumentException("Initial balance cannot be negative ");
        }
        if(owner == null || owner.isEmpty()){
            throw new IllegalArgumentException("Owner cannot be null or empty ");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount){
        System.out.println("Inside deposit, this = " + this);
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive. Got : "+amount);
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Withdrawal amount must be positive. Got : "+amount);
        }
        if(amount>balance){
            throw new IllegalStateException("Insufficient funds Balance : "+balance+", Requested : "+amount);
        }
        balance -= amount;
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
    protected void setBalance(double amount) {
        this.balance = amount;
    }
}
class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String accountNumber,double balance,String owner,double interestRate){
        super(accountNumber,balance,owner);
        if(interestRate<0){
            throw new IllegalArgumentException("Interest rate cannot be negative ");
        }
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        System.out.println("Inside applyInterest, this = " + this);
        double interest = interestRate / 100.0 * getBalance();
        deposit(interest);
    }
}
class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, String owner, double overdraftLimit) {
        super(accountNumber, balance, owner);
        if(overdraftLimit<0){
            throw new IllegalArgumentException("Overdraft limit can't be negative !");
        }
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be positive. Got: " + amount);
        if (amount > (getBalance() + overdraftLimit))
            throw new IllegalStateException("Exceeds overdraft limit");

        setBalance(getBalance() - amount);
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}