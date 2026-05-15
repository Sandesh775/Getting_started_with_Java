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