package designPatternObserver.TempSens;

public class ConcreteTempSens {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        TempSens Ts = new TempSens();
        Ts.notifyDisplays(value);
    }
}
