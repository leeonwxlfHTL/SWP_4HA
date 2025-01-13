package designPatternObserver;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;
    private List<Channel> channels;

    public NewsAgency() {
        this.channels = new ArrayList<Channel>();
    }

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel c : this.channels) {
            c.update(news);
        }
    }

    public String getNews() {
        return news;
    }



}
