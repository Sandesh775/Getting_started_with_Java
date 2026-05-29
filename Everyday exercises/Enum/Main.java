public class Main {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.MONDAY);

        // using for-each loop to print all days
        for(Day d : Day.values()){
            System.out.println(d);
        }

        // making any Day value assign to variable
        Day sunday = Day.SUNDAY;
        System.out.println(sunday);// sunday.toString()
        System.out.println("Index of Day : "+sunday.ordinal());
        System.out.println("Get value as a String : "+sunday.name());
        System.out.println(sunday.toString());

        // Demo for Fruits
        for (Fruits f : Fruits.values()){
            System.out.println("Fruit name : "+f+" , it's level of Sweetness : "+f.getLevelOfSweetness());
        }

        // demo of enum with switch
        LogLevel level = LogLevel.INFO;

        switch (level){
            case INFO -> System.out.println("Info message");
            case ERROR -> System.out.println("Error !");
            case WARNING -> System.out.println("Warning !");
        }

        System.out.println("\n--- Months Enum Demo ---");
        // Accessing any enum value will load the enum class and trigger constructors for all constants
        Months firstMonth = Months.JANUARY;
        System.out.println("First month of the year: " + firstMonth);
    }
}