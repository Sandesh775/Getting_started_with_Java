// Create a TrafficLight system where:
// - 5 cars arrive at different times
// - All cars wait when light is RED
// - When light turns GREEN, ALL cars are notified simultaneously
// - Each car prints: "Car X is passing..."
// - Light changes color every 3 seconds

// Expected Behavior:
// Car 1 arrived and waiting...
// Car 2 arrived and waiting...
// Light turned GREEN → All cars go!
// Car 1 is passing...
// Car 2 is passing...
// Light turned RED
// Car 3 arrived and waiting...
public class TrafficLightsAndDrivers {
    public static void main(String[] args) {
        TrafficLightsSystem system = new TrafficLightsSystem();

        // Start light thread (changes color independently)
        new Light(system).start();

        // Cars arrive at different times
        for(int i = 1; i <= 5; i++) {
            new Car(system, i).start();
            try { Thread.sleep(1000); } catch (Exception e) {} // Cars arrive every 1 sec
        }
    }
}

class TrafficLightsSystem {
    boolean isGreen = false;  // Start with RED

    // Light changes color
    public synchronized void setGreen(boolean green) {
        isGreen = green;
        if(isGreen) {
            System.out.println("\n🚦 Light turned GREEN!");
            notifyAll();  // Wake up any cars waiting at RED
        } else {
            System.out.println("\n🚦 Light turned RED!");
        }
    }

    // Car checks light (doesn't wait if GREEN)
    public synchronized void carArrives(int carId) {
        System.out.println("Car " + carId + " arrived. Light is " + (isGreen ? "GREEN" : "RED"));

        if(isGreen) {
            // GREEN → Go immediately
            System.out.println("Car " + carId + " is passing... 🚗💨");
        } else {
            // RED → Wait until green
            System.out.println("Car " + carId + " waiting at RED signal...");
            try {
                wait();  // Wait for light to turn GREEN
                System.out.println("Car " + carId + " is passing now... 🚗💨");
            } catch (InterruptedException e) {}
        }
    }
}

class Car extends Thread {
    TrafficLightsSystem system;
    int carId;

    Car(TrafficLightsSystem system, int carId) {
        this.system = system;
        this.carId = carId;
    }

    public void run() {
        system.carArrives(carId);
    }
}

class Light extends Thread {
    TrafficLightsSystem system;

    Light(TrafficLightsSystem system) {
        this.system = system;
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(4000);  // RED for 4 seconds
                system.setGreen(true);  // Turn GREEN

                Thread.sleep(3000);  // GREEN for 3 seconds
                system.setGreen(false); // Turn RED
            }
        } catch (InterruptedException e) {}
    }
}