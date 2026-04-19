// Create a Counter class with count variable
// Create 2 threads, each incrementing count 1000 times
// Expected output: 2000
// Run and see what happens (you'll get less than 2000)
// This demonstrates race condition!
public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        // ONE counter shared by BOTH threads
        Counter counter = new Counter();

        // Pass the SAME counter to both threads via constructor
        Threadno1 t1 = new Threadno1(counter);
        Threadno2 t2 = new Threadno2(counter);

        System.out.println("Starting threads...");
        t1.start();
        t2.start();

        System.out.println("Both threads started! Main continues...");

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}

// Shared counter class
class Counter {
    int count;  // This will be shared between threads
}

// Thread 1 - extends Thread
class Threadno1 extends Thread {
    Counter counter;  // Will hold reference to shared counter

    // Constructor receives the shared counter
    Threadno1(Counter counter) {
        this.counter = counter;  // Store reference
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++) {
            counter.count++;  // Access shared counter
        }
        System.out.println("Thread 1 FINISHED");
    }
}

// Thread 2 - extends Thread
class Threadno2 extends Thread {
    Counter counter;  // Will hold reference to shared counter

    // Constructor receives the SAME shared counter
    Threadno2(Counter counter) {
        this.counter = counter;  // Store reference
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++) {
            counter.count++;  // Access SAME shared counter
        }
        System.out.println("Thread 2 FINISHED");
    }
}