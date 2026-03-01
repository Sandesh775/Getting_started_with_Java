public class AbstractClass{
    public static void main(String[] args) {
        // creating objects of child classes, until now
        // we cannot create objects of abstract classes, but in future we may know that as well
        EV car1 = new EV();
        Normal_car car2 = new Normal_car();
        car1.Drive();
        car2.Drive();
        car1.DriveFast();
    }
}
abstract class Car{
     abstract void Drive();
     // can also contain non-abstract methods
     void DriveFast(){
         System.out.println("THis is normal method ");
     }
}
class EV extends Car{
    @Override
    void Drive(){
        System.out.println("Driving in EV car !");
    }
}
class Normal_car extends Car{
    @Override
    void Drive() {
        System.out.println("Driving in normal petrol car !");
    }
}