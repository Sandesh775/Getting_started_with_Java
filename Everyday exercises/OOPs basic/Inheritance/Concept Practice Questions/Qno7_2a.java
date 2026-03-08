// Demo of Single level inheritance
public class Qno7_2a {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "ram";
        System.out.println("h1 obj name is "+h1.name);
    }
}
class Species{
    String name;
}
class Human extends Species{

}