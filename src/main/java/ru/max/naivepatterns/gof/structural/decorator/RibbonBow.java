package ru.max.naivepatterns.gof.structural.decorator;

public class RibbonBow extends FlowerBouquetDecorator {

    private final FlowerBouquet flowerBouquet;

    public RibbonBow(FlowerBouquet flowerBouquet) {
        this.flowerBouquet = flowerBouquet;
    }

    @Override
    public double cost() {
        return 6.5 + flowerBouquet.cost();
    }

    @Override
    public String getDescription() {
        return flowerBouquet.getDescription() + ", ribbon bow";
    }
}
