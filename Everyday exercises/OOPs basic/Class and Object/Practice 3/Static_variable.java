public class Static_variable {
    public static void main(String[] args) {
        System.out.println("Human population :"+Human.population);// acessing static variable without creating object
    }
}
class Human{
    String name;
    int age;
    static String population = "4 billion";// static int population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        // Human.population += 1;
    }
}