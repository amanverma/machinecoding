package SystemDesignlld.notificationSystem.src;

public abstract class Notification {
    NotificationSender notificationSender;
    public Notification(NotificationSender notificationSender){
        this.notificationSender = notificationSender;
    }
    abstract void sendMessage();
}
