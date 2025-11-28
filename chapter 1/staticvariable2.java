class Counter {
    static int count = 0;
    Counter() {
        count++;
    }
}
class staticvariable2 {
    public static void main(String a[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.count);
    }
}