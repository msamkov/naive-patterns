package ru.max.naivepatterns.singleton;

/**
 * Singleton (Одиночка) - ограничивает создание одного экземпляра класса,
 * обеспечивает доступ к его единственному объекту.
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
