package designPatternObserver.weatherStation;

public class WeatherApp implements App{
    private String weatherData;

    public String getData(){
        return weatherData;
    }

    public void update(String newData){
        this.weatherData = newData;
    }
}
