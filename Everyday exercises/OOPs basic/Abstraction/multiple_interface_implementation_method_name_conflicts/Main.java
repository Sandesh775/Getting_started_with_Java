public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();// interface reference type
//        car.start();
//        car.stop();
//        Media carmedia = new Car();
//        carmedia.start();
//        carmedia.stop();
        // this will create confusion, and not a proper implementation of seperate classes
        CarModel car = new CarModel();
        car.start();
        car.startMusic();
    }
}