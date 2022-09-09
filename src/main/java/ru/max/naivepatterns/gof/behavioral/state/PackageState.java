package ru.max.naivepatterns.gof.behavioral.state;

public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();
}
