package designPatternObserver.SharePrice;

import java.util.ArrayList;
import java.util.List;

public abstract class Shares {
    private List<Broker> registertedBrokers;

    public Shares(){
        this.registertedBrokers = new ArrayList<Broker>();
    }

    public void addBrocker(Broker broker) {
        this.registertedBrokers.add(broker);
    }

    public void removeBrocker(Broker broker){
        this.registertedBrokers.remove(broker);
    }

    public void notifyBrokers(double price) {
        for(Broker b : this.registertedBrokers){
            b.update(price);
        }
    }

    abstract double getValue();

    abstract void setValue(double value);


}
