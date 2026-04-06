/*
*  * PARKING LOT MANAGEMENT SYSTEM
 *
 * SCENARIO:
 * You have TWO different parking systems at your mall:
 *
 * 1. CAR PARKING (Ground Floor):
 *    - Can parkCar()
 *    - Can removeCar()
 *    - Has carCapacity of 100
 *
 * 2. BIKE PARKING (Basement):
 *    - Can parkBike()
 *    - Can removeBike()
 *    - Has bikeCapacity of 50
 *
 * NEW REQUIREMENT:
 * Management wants a "HYBRID PARKING ZONE" that can handle BOTH cars and bikes!
 * This zone should have ALL capabilities from BOTH parking systems.
 *
 * THE CATCH:
 * - CarParking and BikeParking are already existing classes (can't modify them)
 * - You must create HybridParking that has methods from BOTH
 * - HybridParking should track its own capacity separately
 *
 * CONSTRAINTS:
 * 1. CarParking and BikeParking are GIVEN classes (see below)
 * 2. You CANNOT change CarParking or BikeParking
 * 3. You CANNOT use extends (Java doesn't allow multiple inheritance)
 * 4. You must find a way to give HybridParking ALL 4 methods:
 *    - parkCar(), removeCar() from CarParking
 *    - parkBike(), removeBike() from BikeParking
 *
 * PART A: Try to solve WITHOUT interfaces first (you'll hit a wall!)
 * PART B: Now solve WITH interfaces
 * */
public class Qno1 {
    public static void main(String[] args) {

    }
}
class ParkingSystem extends HybridParking{

}
interface CarParking{
    int carCapacity = 100;
    void parkCar();
    void removeCar();
}
interface BikeParking{
    int bikeCapacity = 50;
    void parkBike();
    void removeBike();
}
//interface HybridParkingInterface extends CarParking,BikeParking{
//    int totalParkingCapacity = 150;
//    void parkCar();
//    void removeCar();
//    void parkBike();
//    void removeBike();
//}
class HybridParking implements CarParking,BikeParking{// class HybridParking implements HybridParkingInterface
    int totalParkingCapacity = 150;
    @Override
    public void parkCar(){
        System.out.println("Car parked !");
    }
    @Override
    public void removeCar(){
        System.out.println("Car parked removed!");
    }
    @Override
    public void parkBike(){
        System.out.println("Bike parked !");
    }
    @Override
    public void removeBike(){
        System.out.println("Bike parked removed!");
    }
}