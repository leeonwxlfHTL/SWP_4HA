package designPatternObserver.weatherStation;

import java.util.ArrayList;
import java.util.List;

public abstract class Station {

    private List<App> registerdApps;

    public Station() {
        registerdApps = new ArrayList<App>();
    }

    public void registerApp(App app) {
        registerdApps.add(app);
    }

    public void unregisterApp(App app) {
        registerdApps.remove(app);
    }

    public void notifyApps() {
        for (App a : registerdApps) {
            a.update(getData());
        }
    }

    abstract String getData();

    abstract void setData(String newData);
}
