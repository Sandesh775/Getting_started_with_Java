// Create two threads that print numbers 1-5
// Thread 1: "Thread A - 1", "Thread A - 2"...
// Thread 2: "Thread B - 1", "Thread B - 2"...
// Observe how they run simultaneously
public class Question1 {
    static void main() {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        t1.start();
        t2.start();
    }
}
class ThreadA extends Thread{
    @Override
    public void run(){
        for( int i = 1; i<5; i++){
            System.out.println("Thread A - "+i);
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run(){
        for( int i = 1; i<5; i++){
            System.out.println("Thread B - "+i);
        }
    }
}