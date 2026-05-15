
public class GenericsDemo {
    public static void main(String[] args) {
        Printer<Integer> forInt = new Printer<>(10);
        Printer<String> forString = new Printer<>("Hello");
        Printer<Double> forDouble = new Printer<>(15.0);

        forInt.display();
        forDouble.display();
        forString.display();
    }
}
class Printer <T>{
    T ref;
    public Printer(T ref){
        this.ref = ref;
    }
    public void display(){
        System.out.println(ref);
    }
}