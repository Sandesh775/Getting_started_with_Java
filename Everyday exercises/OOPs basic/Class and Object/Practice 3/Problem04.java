/*
* Problem 4: Vehicle System (Multilevel Inheritance) 🚗
Topics: Multilevel Inheritance (Grandparent → Parent → Child)
Task: Create 3 classes:

Vehicle (grandparent): property brand, method start()
Car extends Vehicle (parent): property doors, method drive()
ElectricCar extends Car (child): property batteryCapacity, method charge()

Create an ElectricCar object and call methods from all 3 levels.
Expected Output:
Tesla is starting...
Driving the car with 4 doors
Charging 100 kWh battery...
* */
public class Problem04 {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar("Tesla",4,"100 Kwh");
        e1.start();
        e1.drive();
        e1.charge();
    }
}
class Vehicle{
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start(){
        System.out.println(this.brand+" is starting...");
    }
}
class Car extends Vehicle{
    int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void drive(){
        System.out.println("Driving the car with "+this.doors+" doors");
    }
}
class ElectricCar extends Car{
    String batteryCapacity;

    public ElectricCar(String brand, int doors, String batteryCapacity) {
        super(brand, doors);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge(){
        System.out.println("Charging "+this.batteryCapacity+" kWh battery...");
    }
}