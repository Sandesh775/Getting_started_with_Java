public class ThreadTester {
    static void main() {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("In main thread !");
    }
}