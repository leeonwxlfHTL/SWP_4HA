package designPatternObserver.NewsAgency;

public class Main {

    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("Test");
        System.out.println(observable.getNews() + " = " + observer.getNews());

        NewsAgencyJava observableJava = new NewsAgencyJava();
        NewsChannelJava observerJava = new NewsChannelJava();
        observableJava.addObserver(observerJava);
        observerJava.setNews("Test");
    }
}
