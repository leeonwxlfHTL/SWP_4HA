package designPatternIterator;

public interface Collection {

    /**
     * Creates a Iterator
     * @return the created Iterator
     */
    public Iterator createIterator();

    public void addItem(String str);


}
