public class SmsNotification implements NotificationChannel {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
