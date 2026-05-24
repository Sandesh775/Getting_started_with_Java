package StrategyPattern;

abstract public class Duck implements flyingBehavior,soundBehavior{
    abstract public void fly();
    abstract public void quack();
    abstract public void display();
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
class JetFlying implements flyingBehavior{
    @Override
    public void fly() {
        System.out.println("Jet flying bitch !");
    }
}
// actual duck object
class WildDuck extends Duck{
    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }

    @Override
    public void display() {

    }
}
class CityDuck extends Duck{
    @Override
    public void fly() {

    }

    @Override
    public void quack() {

    }

    @Override
    public void display() {

    }
}