package designPatternObserver.weatherStation;

public class StationConcrete extends Station{

    private String weatherData;

    public String getData() {
        return weatherData;
    }

    public void setData(String newData) {
        this.weatherData = newData;
        notifyApps();
    }

}
