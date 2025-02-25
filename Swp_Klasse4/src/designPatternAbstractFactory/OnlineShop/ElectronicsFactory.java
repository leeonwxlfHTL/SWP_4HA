package designPatternAbstractFactory.OnlineShop;

public class ElectronicsFactory extends  ProductFactory{

        @Override
        public Socks createSocks() {
            return new ElectronicSocks();
        }

        @Override
        public Clock createClock() {
            return new ElectronicClock();
        }
}
