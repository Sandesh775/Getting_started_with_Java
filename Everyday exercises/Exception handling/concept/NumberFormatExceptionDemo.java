public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        // first attempt to trying to convert non numeric elements in String to a Integer
        // like String = "abc123", we can "123" but not "abc123" !
        String invalidnumber = "abc123";
        System.out.println("Invalid conversion : "+invalidnumber+" to number ");
        try
        {
            int number = Integer.parseInt(invalidnumber);
            System.out.println("Number : "+number);
        }catch (NumberFormatException e){
            System.out.println("Error: Cannot convert '" + invalidnumber + "' to number!");
        }
        // Valid conversion
        String validNumber = "123";
        System.out.println("Valid conversion : "+validNumber+" to number ");
        int num2 = Integer.parseInt(validNumber);
        System.out.println("Valid conversion: " + num2);
    }
}
