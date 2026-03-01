public class Car implements Engine,Media{
    @Override
    public void stop() {
        System.out.println("Car Engine start...");
    }

    @Override
    public void start() {
        System.out.println("Car Engine stop...");
    }
}
