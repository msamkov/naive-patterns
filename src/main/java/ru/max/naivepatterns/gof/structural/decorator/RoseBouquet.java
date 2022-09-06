package ru.max.naivepatterns.gof.structural.decorator;

public class RoseBouquet extends FlowerBouquet {

    public RoseBouquet() {
        super.description = "Rose bouquet";
    }

    @Override
    public double cost() {
        return 12.50;
    }
}
