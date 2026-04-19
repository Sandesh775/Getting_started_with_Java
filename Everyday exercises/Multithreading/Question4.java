// Fix the Question 3 using synchronized keyword
// Now output should always be 2000
public class Question4 {
    public static void main() {
        Counter1 counter = new Counter1();

        Mythread1 t1 = new Mythread1(counter);
        Mythread1 t2 = new Mythread1(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){};

        System.out.println("Count finished : "+counter.getCount());
    }
}
class Counter1{
    private int count ;

    // increment method
    public synchronized void increment(){
        count++;  // Access shared counter
    }
    // return count
    public int getCount(){
        return count;
    }
}
class Mythread1 extends Thread{
    Counter1 counter;
    Mythread1(Counter1 count){
        this.counter = count;
    }
    @Override
    public void run(){
        for(int i = 0; i < 100000; i++) {
            counter.increment();
        }
    }
}