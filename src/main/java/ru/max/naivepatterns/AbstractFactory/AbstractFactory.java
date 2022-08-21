package ru.max.naivepatterns.AbstractFactory;

/**
 * Описание:
 * Позволяет выбрать конкретную реализацию фабрики из семейства возможных фабрик.
 * Создает семейство связанных объектов. Легко расширять.
 */
public class AbstractFactory {
    public InteAbsFactory getInteAbsFactory(String currency) {
        switch (currency) {
            case "ru" : return new RuCarPriceAbsFactory();
            case "ua" : return new UaCarPriceAbsFactory();
            default:
                throw new RuntimeException("No factory for this currency");
        }
    }
}
