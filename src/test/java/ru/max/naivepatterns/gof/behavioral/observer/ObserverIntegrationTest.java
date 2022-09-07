package ru.max.naivepatterns.gof.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverIntegrationTest {

    @Test
    public void whenChangingNewsAgencyState_thenNewsChannelNotified() {

        // Новостной канал (наблюдатель)
        NewsChannel observer = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        // Служба новостей (наблюдаемый)
        NewsAgency observable = new NewsAgency();
        observable.addObserver(observer);
        observable.addObserver(observer2);
        observable.setNews("news 1001");

        assertEquals(observer.getNews(), "news 1001");
        assertEquals(observer2.getNews(), "news 1001");
    }

    @Test
    public void whenChangingONewsAgencyState_thenONewsChannelNotified() {

        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}
