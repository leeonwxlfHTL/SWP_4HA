package designPatternObserver.weatherStation;

public class WeatherMain {


    public static void main(String[] args) {
        Station s = new StationConcrete();
        App app = new WeatherApp();

        s.registerApp(app);
        s.setData("Sonnig");
        System.out.println("App: " + app.getData() + " Station: " + s.getData());

    }


}
