package ru.max.naivepatterns.gof.structural.decorator;

public class PaperWrapper extends FlowerBouquetDecorator {

    private final FlowerBouquet flowerBouquet;

    public PaperWrapper(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public double cost() {
        return 3 + flowerBouquet.cost();
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", paper wrap";
    }
}
