package ru.max.naivepatterns.prototype;

/**
 * Помогает создать дублированный объект с лучшей производительностью,
 * вместо нового создается возвращаемый
 * клон существующего объекта. Клонирует существующий объект.
 *
 * Пример из Java:
 *   interface Cloneable
 */

public class Prototype implements Cloneable {
    private String name;
    private String description;

    public Prototype(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Prototype clone() {
        return new Prototype(name, description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
