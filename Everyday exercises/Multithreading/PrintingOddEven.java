public class PrintingOddEven {
    public static void main() {
        OddRunnable runnable1 = new OddRunnable();
        EvenRunnable runnable2 = new EvenRunnable();

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }
}
