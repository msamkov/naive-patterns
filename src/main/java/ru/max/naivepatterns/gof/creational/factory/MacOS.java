package ru.max.naivepatterns.gof.creational.factory;

public class MacOS implements OS {

    @Override
    public void getOS() {
        System.out.println("применить для мак");
    }
}
