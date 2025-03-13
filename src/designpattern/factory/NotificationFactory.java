package designpattern.factory;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if("Email".equalsIgnoreCase(type)){
            return new EmailNotification();
        }else if("SMS".equalsIgnoreCase(type)){
            return new SMSNotification();
        }
        throw  new IllegalArgumentException("Unknown notification type " + type);
    }
}
