// Thread 1: Prints "Good Morning" every 1 second (5 times)
// Thread 2: Prints "Good Night" every 2 seconds (3 times)
// Use Thread.sleep()
public class Question2 {
    public static void main(String[] args) {
        Thread1 obj = new Thread1();
        Thread2 obj2 = new Thread2();

        obj.t1.start();
        obj2.t2.start();
    }
}

class Thread1 {
    Thread t1 = new Thread() {
        @Override
        public void run() {
            for(int i = 0; i < 5; i++) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                }
            }
        }
    };
}

class Thread2 {
    Thread t2 = new Thread() {
        @Override
        public void run() {
            for(int i = 0; i < 3; i++) {
                System.out.println("Good Night !");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted!");
                }
            }
        }
    };
}