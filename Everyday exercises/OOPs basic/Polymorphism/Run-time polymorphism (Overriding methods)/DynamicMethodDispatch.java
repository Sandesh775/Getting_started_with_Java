public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Ram();
        Human h3 = new Shyam();
        h1.info();// calls Human class version of info()
        h2.info();// calls Ram class version of info()
        h3.info();// calls Shyam class version of info()
        // or maybe create a new reference type variable of Human to store reference of all three h1, h2, h3..
        Human ref = new Human();
        ref = h1;
        // now let's call three different version of method but this time with this reference variable
        System.out.println("Calling three different version of method info() but using ref variable !");
        ref.info();
        ref = h2;
        ref.info();
        ref = h3;
        ref.info();

    }
}
class Human{
    public void info(){
        System.out.println("Inside Human class info method !");
    }
}
class Ram extends Human{
    @Override
    public void info(){
        System.out.println("Inside Ram class info method !");
    }
}
class Shyam extends Human{
    @Override
    public void info(){
        System.out.println("Inside Shyam class info method !");
    }
}