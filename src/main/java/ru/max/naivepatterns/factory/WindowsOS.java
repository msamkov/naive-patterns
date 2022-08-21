package ru.max.naivepatterns.factory;

public class WindowsOS implements OS {

    @Override
    public void getOS() {
        System.out.println("применить для виндовс");
    }
}
