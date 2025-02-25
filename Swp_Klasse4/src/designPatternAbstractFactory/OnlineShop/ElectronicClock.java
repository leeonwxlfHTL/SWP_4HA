package designPatternAbstractFactory.OnlineShop;

public class ElectronicClock extends Clock{
    @Override
    public void createClock(){
        System.out.println("Electronic Clock created");
        System.out.println("Counts Steps");
    }
}
