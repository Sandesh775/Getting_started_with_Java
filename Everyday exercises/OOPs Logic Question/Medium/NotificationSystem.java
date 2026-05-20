/*
* /**
 * DESIGN REQUIREMENT:
 *
 * You're building a notification system that supports:
 * - Email notifications
 * - SMS notifications
 * - Push notifications
 *
 * All notifications should:
 * - Have a send() method
 * - Have a getStatus() method
 * - Track if they were sent successfully
 *
 * Email and SMS need recipient validation (email format, phone format)
 * Push notifications need device token validation
 *
 * YOUR TASK:
 *
 * 1. Create interface: Notification
 *    - void send(String message)
 *    - boolean getStatus()
 *
 * 2. Create abstract class: ValidatedNotification implements Notification
 *    - boolean validateRecipient() (abstract)
 *    - Common status tracking
 *
 * 3. Create concrete classes:
 *    - EmailNotification extends ValidatedNotification
 *    - SMSNotification extends ValidatedNotification
 *    - PushNotification implements Notification (no validation needed)
 *
 * 4. In main():
 *    - Create array of Notification[]
 *    - Send 3 different notification types
 *    - Print status of each
 *
 * TIME LIMIT: 60 minutes
 */

interface Notification {
    void send(String message);
    boolean getStatus();
}

abstract class ValidatedNotification implements Notification {
    abstract boolean validateRecipient();

    @Override
    public boolean getStatus() {
        if(!validateRecipient()){
            return false;
        }
        System.out.println("Notification validated ");
        return true;
    }
}

class EmailNotification extends ValidatedNotification {
    String email;

    public EmailNotification(String email){
        this.email = email;
    }

    public void send(String message){
        if(!validateRecipient()){
            System.out.println("Not a valid email !");
            return;
        }
        System.out.println("Send message : "+message+" via Email !");
    }

    public boolean validateRecipient(){
        if(email.contains("@")){
            return true;
        }
        return false;
    }

    public boolean getStatus(){
        return validateRecipient();
    }
}

class SMSNotification extends ValidatedNotification {
    String phoneNumber;

    public SMSNotification(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void send(String message){
        if(!validateRecipient()){
            System.out.println("Not a valid phone number !");
            return;
        }
        System.out.println("Send message : "+message+" via Phone !");
    }

    public boolean validateRecipient(){
        if(phoneNumber.length()==10){
            return true;
        }
        return false;
    }

    public boolean getStatus(){
        return validateRecipient();
    }
}

class PushNotification implements Notification {

    public void send(String message){
        System.out.println("Send message : "+message+" via Push !");
    }

    public boolean getStatus(){
        ?;
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = {
          new EmailNotification("Hello@world123.gmail.com"),
          new SMSNotification("9886745369"),
          new PushNotification()
        };

        for (Notification n : notifications){
            n.send("Hello world !");
            n.getStatus();
        }
    }
}
//HINT:
//
//ValidatedNotification should have protected boolean sent = false;
//EmailNotification validates with: email.contains("@")
//SMSNotification validates with: phone.length() == 10
//PushNotification always succeeds