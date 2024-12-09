package designPatternIterator;

public class NotificationIterator implements Iterator {
    private  Notification[] notificationList;
    private int pos = 0;

    public  NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
        this.pos = 0;
    }

    /**
     * Returns the next element
     * @return the next element
     */
    public Object next(){
        Notification notification = notificationList[pos];
        pos++;
        return notification;
    }

    /**
     * Checks if there is a next element
     * @return true if there is a next element, false if not
     */
    public  boolean hasNext() {
        if(pos < notificationList.length && notificationList[pos] != null) {
            return true;
        }
        return false;
    }
}
