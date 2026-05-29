//Create Vehicle parent, Car and Bike children
//Car has openTrunk(), Bike has ringBell()
//Create Vehicle[] array with mixed types
//Loop and call type-specific methods using instanceof
public class CastingExample2 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
          new Bike(),
          new Car(),
          new Bike(),
        };

        for(Vehicle v : vehicles){
            v.start();
            if (v instanceof Bike){
                ((Bike) v).ringBell();
            }
            else if(v instanceof Car){
                ((Car) v ).openTrunk();
            }
            System.out.println(" ");
        }
    }
}
class Vehicle {
    void start(){
        System.out.println("Starting vehicle ");
    }
}
class Car extends Vehicle{
    void openTrunk(){
        System.out.println("Opening trunk ");
    }
}
class Bike extends Vehicle{
    void ringBell(){
        System.out.println("Ringing bell ");
    }
}