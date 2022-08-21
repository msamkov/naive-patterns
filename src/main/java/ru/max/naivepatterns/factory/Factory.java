package ru.max.naivepatterns.factory;

public class Factory {
    public OS getCurrentOS(String inputos) {
        OS os = null;
        switch (inputos) {
            case "windows":
                os = new WindowsOS();
                break;
            case "linux":
                os = new LinuxOS();
                break;
            case "mac":
                os = new MacOS();
                break;
        }
        return os;
    }
}
