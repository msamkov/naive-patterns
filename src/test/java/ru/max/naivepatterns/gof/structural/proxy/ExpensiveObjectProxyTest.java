package ru.max.naivepatterns.gof.structural.proxy;

import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.structural.proxy.ExpensiveObject;
import ru.max.naivepatterns.gof.structural.proxy.ExpensiveObjectProxy;

class ExpensiveObjectProxyTest {

    @Test
    void testProcess() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}