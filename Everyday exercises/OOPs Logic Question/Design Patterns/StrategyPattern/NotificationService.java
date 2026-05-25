package StrategyPattern;
interface NotificationStrategy {
    void send(String message);
}
class NotificationService {
    private NotificationStrategy notify;

    public NotificationService(NotificationStrategy notify) {
        this.notify = notify;
    }

    public void sendAlert(String text){
        if(text.isEmpty()){
            throw new IllegalArgumentException("Invalid notification text ignored.");
        }
        notify.send(text);
    }
}