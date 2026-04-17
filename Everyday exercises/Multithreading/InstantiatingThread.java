public class InstantiatingThread {
    static void main() {
        Thread t1 = new Thread();// not passing any Runnable interface

        MyRunnable runnableobj = new MyRunnable();
        Thread t2 = new Thread(runnableobj);

        // This IS ALSO implementing Runnable
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                System.out.println("In newly created Runnable object thread passed through constructor in Thread class");
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}