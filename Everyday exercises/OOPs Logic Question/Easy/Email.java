enum EmailStatus{
    PENDING, SENT, FAILED
}
public class Email {
    private int emailId;
    private EmailStatus status;

    public Email(int emailId, EmailStatus status) {
        this.emailId = emailId;
        this.status = EmailStatus.PENDING;  // default
    }

    void markAsSent(){
        this.status = EmailStatus.SENT;
    }

    void markAsFailed(){
        this.status = EmailStatus.FAILED;
    }

    EmailStatus getStatus(){
        return status;
    }
}
/* PENDING is the default state — when neither isSent nor isFailed is true. So no separate boolean needed.
* class Email {
    private int emailId;
    private boolean isSent = false;
    private boolean isFailed = false;

    Email(int emailId) {
        this.emailId = emailId;
    }

    void markAsSent() {
        if (isFailed) {
            System.out.println("Can't send failed email!");
            return;
        }
        isSent = true;
    }

    void markAsFailed() {
        isFailed = true;
    }

    String getStatus() {
        if (isSent) return "SENT";
        if (isFailed) return "FAILED";
        return "PENDING";
    }
}
* */