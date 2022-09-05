package ru.max.naivepatterns.gof.structural.flyweight;


import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.structural.flyweight.Vehicle;
import ru.max.naivepatterns.gof.structural.flyweight.VehicleFactory;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleFactoryTest {

    @Test
    public void testDifferentFlyweightObjects() {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

        assertNotNull(blackVehicle, "Object returned by the factory is null!");
        assertNotNull(blueVehicle, "Object returned by the factory is null!");
        assertNotEquals(blackVehicle, blueVehicle, "Objects returned by the factory are equals!");
    }


    @Test
    public void testSameFlyweightObjects() {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle anotherBlackVehicle = VehicleFactory.createVehicle(Color.BLACK);

        assertNotNull(blackVehicle, "Object returned by the factory is null!");
        assertNotNull(anotherBlackVehicle, "Object returned by the factory is null!");
        assertEquals(blackVehicle, anotherBlackVehicle, "Objects returned by the factory are not equals!");
    }

}