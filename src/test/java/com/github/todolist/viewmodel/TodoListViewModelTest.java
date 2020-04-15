package com.github.todolist.viewmodel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TodoListViewModelTest {
    @Test
    public void testInvertTodoItemStatus() {
        TodolistViewModel viewModel = new TodolistViewModel();
        viewModel.setInput("do something important");
        viewModel.addTodoItem();

        viewModel.invertTodoItemStatus(0);

        assertTrue(viewModel.getTodoItems().get(0).isDone());
    }
}
