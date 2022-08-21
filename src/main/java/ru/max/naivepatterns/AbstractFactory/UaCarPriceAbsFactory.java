package ru.max.naivepatterns.AbstractFactory;

public class UaCarPriceAbsFactory implements InteAbsFactory {
    @Override
    public Lada getLada() {
        return new UaLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new UaFerrariImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new UaPorsheImpl();
    }
}
