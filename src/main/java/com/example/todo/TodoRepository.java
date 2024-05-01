package com.example.todo;

import java.util.*;
import com.example.todo.Todo;

public interface TodoRepository {
    ArrayList<Todo> getAllTodos();

    Todo addTodo(Todo todo);

    Todo getTodoById(int todoId);

    Todo updateTodo(int todoId, Todo todo);

    void deleteTodo(int todoId);
}