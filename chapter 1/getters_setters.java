class getters_setters {
    public static void main(String[] args){
        Balance obj1 = new Balance();
        // to read privatevariable value
        System.out.println("Current balance read : "+obj1.getBalance());
        // to write private variable value
        obj1.setBalance(100000);
        System.out.println("Updated balance write : "+obj1.getBalance());
    }
}
class Balance{
    private int id;
    private String name;
    private int currentbalance = 5000;
    public int getBalance(){
        return currentbalance;
    }
    public void setBalance(int value){
        // let's use setter for validation
        if(value>0 && value!= 0){
        this.currentbalance = value;
        }
        else{
            System.out.println("Please enter valid amount");
        }
    }
}