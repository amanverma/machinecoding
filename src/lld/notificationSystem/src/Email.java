package lld.notificationSystem.src;

public class Email implements  NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Email Sent");
    }
}
