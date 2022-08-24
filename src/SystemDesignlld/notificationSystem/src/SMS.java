package SystemDesignlld.notificationSystem.src;

public class SMS implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("SMS Sent");
    }
}
