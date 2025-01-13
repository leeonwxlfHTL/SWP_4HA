package designPatternObserver.SharePrice;

public class SharesMain {

    public static void main(String[] args){
        Shares s = new ConcreteShares();
        Broker b = new ConcreteBroker();

        s.addBrocker(b);

        s.setValue(10.0);
        System.out.println(s.getValue() + " = " + b.getValue());
    }
}
