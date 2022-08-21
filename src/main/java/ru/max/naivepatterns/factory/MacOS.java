package ru.max.naivepatterns.factory;

public class MacOS implements OS {

    @Override
    public void getOS() {
        System.out.println("применить для мак");
    }
}
