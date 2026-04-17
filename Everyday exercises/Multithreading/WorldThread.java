public class WorldThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("World !");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {

            }
        }
    }
}
