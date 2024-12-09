package designPatternIterator;

public interface Iterator {

    /**
     * Checks if there is a next element
     * @return true if there is a next element, false if not
     */
    public boolean hasNext();

    /**
     * Returns the next element
     * @return the next element
     */
    public Object next();
}
