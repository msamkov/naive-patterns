package ru.max.naivepatterns.AbstractFactory;

public class RuCarPriceAbsFactory implements InteAbsFactory {

    @Override
    public Lada getLada() {
        return new RuLadaImpl();
    }

    @Override
    public Ferrari getFerrari() {
        return new RuFerrariImpl();
    }

    @Override
    public Porshe getPorshe() {
        return new RuPorsheImpl();
    }
}
