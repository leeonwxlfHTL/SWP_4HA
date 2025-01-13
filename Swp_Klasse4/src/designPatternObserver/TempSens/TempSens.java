package designPatternObserver.TempSens;



import java.util.ArrayList;
import java.util.List;

public abstract class TempSens {


    private List<Display> registertedDisplays;

    public TempSens() {
        this.registertedDisplays = new ArrayList<Display>();
    }

    public void addObserver(Display displ) {
        this.registertedDisplays.add(displ);
    }

    public void removeObserver(Display displ) {
        this.registertedDisplays.remove(displ);
    }

   public void notifyDisplays(String value) {
        for (Display d : this.registertedDisplays) {
            d.update(value);
        }
    }

    abstract String getValue();

    abstract void setValue(String value);


}
