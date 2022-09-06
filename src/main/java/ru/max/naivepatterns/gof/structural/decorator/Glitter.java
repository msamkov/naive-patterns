package ru.max.naivepatterns.gof.structural.decorator;

public class Glitter extends FlowerBouquetDecorator {

    private final FlowerBouquet flowerBouquet;

    public Glitter(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public double cost() {
        return 4 + flowerBouquet.cost();
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", glitter";
    }
}
