package ru.max.naivepatterns.gof.structural.bridge;

/**
 * Bridge (Мост)
 *
 * Разделяет реализацию и абстракцию, дает возможность изменять их свободно друг от друга.
 * Делает конкретные классы независимыми от классов реализации интерфейса.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
