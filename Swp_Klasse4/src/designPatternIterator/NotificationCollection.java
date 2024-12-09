package designPatternIterator;

public class NotificationCollection implements Collection{

    private static final int maxItems =6;
    int numberOfItems = 0;
    Notification[] notificationList;


    public NotificationCollection() {
        this.notificationList = new Notification[maxItems];
    }

    /**
     * Add a new item to the notification list
     * @param str is the notification to be added
     */
    public void addItem(String str) {
        Notification notification = new Notification(str);
        if(numberOfItems >= maxItems) {
            System.err.println("Notification collection is full");
        } else {
            notificationList[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    /**
     * Create a new iterator
     * @return the created iterator
     */
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
