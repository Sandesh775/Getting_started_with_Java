package StrategyPattern;

public abstract class Duck {
    // Composition: The Duck HAS-A behavior, it IS-NOT a behavior
    private flyingBehavior flyer;
    private soundBehavior quacker;
    // Constructor injection (Dependency Injection)
    public Duck(flyingBehavior flyer, soundBehavior quacker) {
        this.flyer = flyer;
        this.quacker = quacker;
    }
    public void performQuack() {
        quacker.quack(); // Delegating the behavior
    }
    public void performFly() {
        flyer.fly(); // Delegate the work to our encapsulated strategy!
    }
    public abstract void display();
}
interface flyingBehavior{
    void fly();
}
interface soundBehavior{
    void quack();
}
// concrete classes implement specifically both behaviors separately
class SimpleQuack implements soundBehavior{
    @Override
    public void quack(){
        System.out.println("Quack..quack...");
    }
}
class NoQuack implements soundBehavior{
    @Override
    public void quack(){
        System.out.println("No..quack...at..all..!");
    }
}
class SimpleFlying implements flyingBehavior{
    @Override
    public void fly() {
        System.out.println("Simply flying and flying ...");
    }
}
class NoFlying implements flyingBehavior{
    @Override
    public void fly() {
        System.out.println("No flying..!");
    }
}
// actual duck object
class WildDuck extends Duck {

    // The constructor defines exactly what a WildDuck IS composed of
    public WildDuck() {
        // 'super' passes these concrete strategies up to the Duck parent class
        super(new SimpleFlying(), new SimpleQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a wild forest duck hiding in the trees.");
    }
}

class CityDuck extends Duck {

    public CityDuck() {
        // A CityDuck might not fly, but it can still quack simply!
        super(new NoFlying(), new SimpleQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a city pond duck waiting for breadcrumbs.");
    }
}