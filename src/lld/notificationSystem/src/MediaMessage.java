package lld.notificationSystem.src;

public class MediaMessage extends Notification{
    public MediaMessage(NotificationSender notificationSender){
        super(notificationSender);
        System.out.println("It's a media message");
    }
    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
