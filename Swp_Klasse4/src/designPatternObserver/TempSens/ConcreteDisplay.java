package designPatternObserver.TempSens;

public class ConcreteDisplay implements  Display{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void update(String value) {
        this.value = value;
    }

}
