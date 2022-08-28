package ru.max.naivepatterns.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight (Легковес)
 *
 * Вместо создания большого количества похожих объектов, объекты используются повторно. Экономит память.
 */
public class VehicleFactory {

    private static final Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    private VehicleFactory() {
    }

    public static Vehicle createVehicle(Color color) {
        // Looks for the requested vehicle into the cache.
        // If the vehicle doesn't exist, a new one is created.
        return vehiclesCache.computeIfAbsent(color, newColor -> {
            // Creates the new car.
            Engine newEngine = new Engine();
            return new Car(newEngine, newColor);
        });
    }
}
