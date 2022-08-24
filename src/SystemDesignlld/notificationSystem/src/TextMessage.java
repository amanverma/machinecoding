package SystemDesignlld.notificationSystem.src;

public class TextMessage extends Notification{
    public TextMessage(NotificationSender notificationSender){
        super(notificationSender);
        System.out.println("It's a text message");
    }
    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
