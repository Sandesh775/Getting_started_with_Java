public class ValidateAge {
    public static void main(String[] args) {
        int age = -5;
        try {
            if(age<=0){
                throw new IllegalArgumentException("Age cannot be negative !");
            }
            if(age>120){
                throw new IllegalArgumentException("Age cannot be greater than 120");
            }
            System.out.println("Valid age : "+age);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
