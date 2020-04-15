package com.github.todolist.viewmodel;

import com.github.todolist.model.TodoItem;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import java.util.ArrayList;
import java.util.List;

public class TodolistViewModel {
    private String input;
    private final List<TodoItem> todoItems = new ArrayList<>();

    @NotifyChange("*")
    @Command
    public void addTodoItem() {
        todoItems.add(new TodoItem(input));
        input = "";
    }

    @NotifyChange("todoItems")
    @Command
    public void invertTodoItemStatus(@BindingParam("index") int index) {
        todoItems.get(index).invertStatus();
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }
}
