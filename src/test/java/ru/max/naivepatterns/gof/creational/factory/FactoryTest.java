package ru.max.naivepatterns.gof.creational.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.max.naivepatterns.gof.creational.factory.Factory;
import ru.max.naivepatterns.gof.creational.factory.LinuxOS;
import ru.max.naivepatterns.gof.creational.factory.MacOS;
import ru.max.naivepatterns.gof.creational.factory.OS;
import ru.max.naivepatterns.gof.creational.factory.WindowsOS;

class FactoryTest {

    @Test
    void testCreateLinux() {
        String osName = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(osName);
        Assertions.assertTrue(os instanceof LinuxOS);
    }

    @Test
    void testCreateMac() {
        String osName = "mac";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(osName);
        Assertions.assertTrue(os instanceof MacOS);
    }

    @Test
    void testCreateWin() {
        String osName = "windows";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(osName);
        Assertions.assertTrue(os instanceof WindowsOS);
    }
}