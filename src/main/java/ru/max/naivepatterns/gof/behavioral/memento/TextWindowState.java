package ru.max.naivepatterns.gof.behavioral.memento;

public class TextWindowState {

    private String text;

    public TextWindowState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
