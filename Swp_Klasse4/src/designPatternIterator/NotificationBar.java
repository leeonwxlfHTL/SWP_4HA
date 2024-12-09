package designPatternIterator;

public class NotificationBar {
    private NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        super();
        this.notifications = notifications;
    }

    /**
     * Prints all notifications
     */
    public void printNotifications() {
        Iterator iterator = notifications.createIterator();
        System.out.println("-----------Notification Bar-----------");
        while(iterator.hasNext()) {
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }

    /**
     * Add a new item to the notification list
     * @param str is the notification to be added
     */
    public void addItem(String str) {
        notifications.addItem(str);
    }
}
