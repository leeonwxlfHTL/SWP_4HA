package designPatternObserver.SharePrice;

public interface Broker {
    public void update(double value);

    public double getValue();

}
