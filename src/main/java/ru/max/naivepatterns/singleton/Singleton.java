package ru.max.naivepatterns.singleton;

/**
 * Singleton (Одиночка) - ограничивает создание одного экземпляра класса,
 * обеспечивает доступ к его единственному объекту.
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
