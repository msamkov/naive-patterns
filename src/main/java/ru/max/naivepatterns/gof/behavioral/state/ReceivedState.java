package ru.max.naivepatterns.gof.behavioral.state;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("Этот пакет уже получен клиентом.");

    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Посылка получена клиентом.");
    }

}
