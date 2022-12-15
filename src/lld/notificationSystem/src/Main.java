package lld.notificationSystem.src;

public class Main {
    public static void main(String[] args) {
        QRMessage qrMessage = new QRMessage(new WhatsApp());
        qrMessage.sendMessage();
    }
}
