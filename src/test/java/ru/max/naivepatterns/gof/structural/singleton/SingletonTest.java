package ru.max.naivepatterns.gof.structural.singleton;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.structural.singleton.Singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertSame(singleton1, singleton2);
    }
}