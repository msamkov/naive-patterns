package ru.max.naivepatterns.gof.creational.adapter;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.creational.adapter.BugattiVeyron;
import ru.max.naivepatterns.gof.creational.adapter.Movable;
import ru.max.naivepatterns.gof.creational.adapter.MovableAdapter;
import ru.max.naivepatterns.gof.creational.adapter.MovableAdapterImpl;

import static org.junit.jupiter.api.Assertions.*;

class MovableAdapterTest {

    @Test
    void getSpeed() {
        Movable bugattiVeyron = new BugattiVeyron();
        double expectedKMPH = 431.30312;
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        assertEquals(expectedKMPH, bugattiVeyronAdapter.getSpeed());
    }
}