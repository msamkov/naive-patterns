package ru.max.naivepatterns.gof.structural.decorator;

public abstract class FlowerBouquet {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
