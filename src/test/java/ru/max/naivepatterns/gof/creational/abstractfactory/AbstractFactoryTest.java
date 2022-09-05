package ru.max.naivepatterns.gof.creational.abstractfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.creational.abstractfactory.AbstractFactory;
import ru.max.naivepatterns.gof.creational.abstractfactory.InteAbsFactory;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void getInteAbsFactory() {
        AbstractFactory factory = new AbstractFactory();
        InteAbsFactory factoryRu = factory.getInteAbsFactory("ru");
        InteAbsFactory factoryUa = factory.getInteAbsFactory("ua");
        Assertions.assertEquals(10001, factoryRu.getLada().getLadaPrice());
        Assertions.assertEquals(30002, factoryRu.getFerrari().getFerrariPrice());
        Assertions.assertEquals(20003, factoryRu.getPorshe().getPorshePrice());

        Assertions.assertEquals(1000, factoryUa.getLada().getLadaPrice());
        Assertions.assertEquals(3000, factoryUa.getFerrari().getFerrariPrice());
        Assertions.assertEquals(2000, factoryUa.getPorshe().getPorshePrice());
    }

    @Test
    void  exceptionAbstractFactory() {
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () ->  {
                    AbstractFactory factory = new AbstractFactory();
                    InteAbsFactory factoryEn =  factory.getInteAbsFactory("en");},
                "Expected getInteAbsFactory() to throw, but it didn't"
        );
        assertEquals("No factory for this currency", thrown.getMessage());
    }


}