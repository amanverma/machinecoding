package SystemDesignlld.notificationSystem.src;

public class QRMessage extends Notification{
    public QRMessage(NotificationSender notificationSender){
        super(notificationSender);
        System.out.println("It's a QR Message");
    }
    @Override
    void sendMessage() {
        notificationSender.sendNotification();

    }
}
