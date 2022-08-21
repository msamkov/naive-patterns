package ru.max.naivepatterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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