package ru.max.naivepatterns.gof.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithm1ImplTest {

    @Test
    void testExecute() {
        AlgorithmSkeleton algorithm = new Algorithm1Impl();
        algorithm.execute();
    }
}