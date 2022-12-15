package lld.notificationSystem.src;

public class WhatsApp implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("WhatsApp message sent");
    }
}
