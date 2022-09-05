package ru.max.naivepatterns.gof.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testDraw() {

        //a square with red color
        Shape square = new Square(new Red());
        assertEquals(square.draw(), "Square drawn. Color is Red");

        //a triangle with blue color
        Shape triangle = new Triangle(new Blue());
        assertEquals(triangle.draw(), "Triangle drawn. Color is Blue");
    }
}