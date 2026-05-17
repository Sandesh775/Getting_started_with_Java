/*
* Problem 1: Vehicle System
Create:

Interface Vehicle with method start()

Classes Car and Bike implementing Vehicle

Car.start() prints "Car engine started"

Bike.start() prints "Bike engine started"

In main(), create an array of Vehicle containing one Car and one Bike

Loop through array and call start() on each

Question after you code: To add a Truck, how many existing classes must change?*/
public class VehicleSystem {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        // Array of vehicle
        Vehicle [] vehicles = {c1,b1};

        // loop through array
        for(Vehicle v : vehicles){
            v.start();
        }
    }
}
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car engine started");
    }
}
class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike engine started");
    }
}
// Answer : Zero !