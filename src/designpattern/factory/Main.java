package designpattern.factory;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notifyUser("EMAIL","This is Email service");
        notificationService.notifyUser("Push", "Push notification");
    }
}
