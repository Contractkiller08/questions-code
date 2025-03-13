package designpattern.factory;

public class NotificationService {
    public void notifyUser(String type, String message){
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}
