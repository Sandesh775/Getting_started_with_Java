package Interfaces;

public class Car implements Engine, Mediaplayer {// now this is the class where we will actually implement those abstract methods
// implementing single interface will looks similar to as usual inheritance stuff
    // but interfaces are different which will allow me to use the different methods from two different interfaces to use
    // and implement accordingly
    @Override
    public void start() {
        System.out.println("Car starts !");
    }

    @Override
    public void stop() {
        System.out.println("Car stops !");
    }
    public void Musicstart(){
        System.out.println("Car music player starts !");
    }
    public void Musicstop(){
        System.out.println("Car music player stops !");
    }
}
/*
* Redesigned interfaces :
* package Interfaces;

public interface Engine {
    void startEngine();
    void stopEngine();
}

public interface Mediaplayer {
    void playMusic();
    void stopMusic();
}

public class Car implements Engine, Mediaplayer {
    @Override
    public void startEngine() {
        System.out.println("Car engine starts!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stops!");
    }

    @Override
    public void playMusic() {
        System.out.println("Music starts playing!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stops!");
    }
}
* */