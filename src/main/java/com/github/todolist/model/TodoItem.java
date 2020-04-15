package com.github.todolist.model;

public class TodoItem {
    private final String text;
    private boolean done;

    public TodoItem(String text) {
        this.text = text;
    }

    public void invertStatus() {
        done = !done;
    }

    public boolean isDone() {
        return done;
    }

    public String getText() {
        return text;
    }
}
