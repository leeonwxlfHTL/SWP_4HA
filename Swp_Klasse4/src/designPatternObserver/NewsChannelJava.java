package designPatternObserver;

import java.util.Observer;
import java.util.Observable;

public class NewsChannelJava implements Observer{

        private String news;

        public String getNews() {
            return news;
        }

        public void setNews(String news) {
            this.news = news;
        }

        public void update(Observable o, Object args) {
            this.news = (String) news;
        }
}
