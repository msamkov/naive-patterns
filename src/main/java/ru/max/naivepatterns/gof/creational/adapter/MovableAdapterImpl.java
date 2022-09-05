package ru.max.naivepatterns.gof.creational.adapter;

/**
 * Используя паттерн, мы можем объединить два несовместимых объекта. Конвертер между двумя несовместимыми объектами.
 */
public class MovableAdapterImpl implements MovableAdapter {

    private final Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    // конвертировать мили/час в км/час
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
