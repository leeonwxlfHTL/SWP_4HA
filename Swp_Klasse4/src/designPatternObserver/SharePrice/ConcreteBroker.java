package designPatternObserver.SharePrice;

public class ConcreteBroker implements Broker {
    double stockPrice;

    public void update(double newStockPrice)
    {
        this.stockPrice=newStockPrice;
    }

    public double getValue()
    {
        return stockPrice;
    }
}
