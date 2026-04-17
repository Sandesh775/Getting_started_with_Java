public class PrintingThreads {
    static void main() {
        HelloThread t1 = new HelloThread();
        WorldThread t2 = new WorldThread();
        t1.start();
        t2.start();
    }
}