package ru.max.naivepatterns.gof.behavioral.state;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("Пакет находится в начальном состоянии.");
    }

    @Override
    public void printStatus() {
        System.out.println("Посылка заказана, еще не доставлена в офис.");
    }
}
