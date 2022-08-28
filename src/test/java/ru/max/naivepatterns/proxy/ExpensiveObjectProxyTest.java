package ru.max.naivepatterns.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpensiveObjectProxyTest {

    @Test
    void testProcess() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}