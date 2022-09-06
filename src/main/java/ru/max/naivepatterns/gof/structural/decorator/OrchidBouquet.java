package ru.max.naivepatterns.gof.structural.decorator;

public class OrchidBouquet extends FlowerBouquet {

    public OrchidBouquet() {
        super.description = "Orchid bouquet";
    }

    @Override
    public double cost() {
        return 29.90;
    }
}
