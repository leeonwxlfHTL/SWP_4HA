package designPatternObserver.SharePrice;

public class ConcreteShares extends Shares {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
        notifyBrokers(value);
    }
}
