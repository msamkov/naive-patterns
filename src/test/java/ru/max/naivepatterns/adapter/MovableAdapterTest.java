package ru.max.naivepatterns.adapter;

import org.junit.jupiter.api.Test;

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