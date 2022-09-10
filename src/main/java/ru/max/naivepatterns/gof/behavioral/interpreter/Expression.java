package ru.max.naivepatterns.gof.behavioral.interpreter;

import java.util.List;

public interface Expression {
    List<String> interpret(Context ctx);
}
