public class CarModel {
    private Engine e;
    private Media m = new CDPlayer();
    CarModel(){
        this.e = new PowerEngine();
    }
    public void start(){
        e.start();
    }
    public void stop(){
        e.stop();
    }
    public void startMusic(){
        m.start();
    }
    public void stopMusic(){
        m.stop();
    }
}
