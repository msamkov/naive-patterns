package ru.max.naivepatterns.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {

    @Test
    void copy() {
        Prototype prototype = new Prototype("Obj1", "Desc2");
        Prototype prototype2 = prototype.clone();
        assertEquals(prototype.getName(), prototype2.getName());
        assertEquals(prototype.getDescription(), prototype2.getDescription());
        assertTrue(prototype != prototype2);
    }
}