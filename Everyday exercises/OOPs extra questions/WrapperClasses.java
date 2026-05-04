public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        float num2 = 100f;
        double num3 =  100.57;
        char ch = 'A';
        // Autoboxing
        Integer a = num;// here only this method is autoboxing others can't consider to be auto boxing !

        Float b;
        b = num2;

        Double c = new Double(num3);

        Character character = Character.valueOf(ch);;

        System.out.println("Integer : "+a+
                "\nFloat : "+b+
                "\nDouble : "+c+
                "\nCharacter : "+character);

        int integer = a;// Auto unboxing !
    }
}