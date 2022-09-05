package ru.max.naivepatterns.gof.structural.proxy;

/**
 * Proxy (Заместитель)
 *
 * Представляет объекты, которые могут контролировать другие объекты перехватывая их вызовы.
 * Можно перехватить вызов оригинального объекта.
 */
public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}
