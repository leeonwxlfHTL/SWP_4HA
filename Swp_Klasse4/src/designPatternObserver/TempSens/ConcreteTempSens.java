package designPatternObserver.TempSens;

public class ConcreteTempSens extends TempSens {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyDisplays(value);
    }
}
