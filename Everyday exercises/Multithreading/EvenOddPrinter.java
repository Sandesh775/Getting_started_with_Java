// Two threads printing numbers 1-20
// Thread 1: Prints only odd numbers
// Thread 2: Prints only even numbers
// Output should be in correct order: 1,2,3,4...20
// (Use wait() and notify())
public class EvenOddPrinter {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();

        Thread evenThread = new Thread(() -> {
            for(int i = 0; i <= 20; i += 2) {
                printer.printEven(i);
            }
        });

        Thread oddThread = new Thread(() -> {
            for(int i = 1; i <= 20; i += 2) {
                printer.printOdd(i);
            }
        });

        evenThread.start();
        oddThread.start();
    }
}

class SharedPrinter {
    boolean isEvenTurn = true;  // Start with even

    public synchronized void printEven(int num) {
        while(!isEvenTurn) {
            try { wait(); } catch(Exception e) {}
        }
        System.out.println("Even: " + num);
        isEvenTurn = false;
        notify();
    }

    public synchronized void printOdd(int num) {
        while(isEvenTurn) {
            try { wait(); } catch(Exception e) {}
        }
        System.out.println("Odd: " + num);
        isEvenTurn = true;
        notify();
    }
}