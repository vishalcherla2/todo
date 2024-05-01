package com.example.todo;

import com.example.todo.TodoService;
import com.example.todo.Todo;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class TodoController {
       TodoService todoService = new TodoService();

       @GetMapping("/todos")
       public ArrayList<Todo> getAllTodos() {
              return todoService.getAllTodos();
       }

       @PostMapping("/todos")
       public Todo addTodo(@RequestBody Todo todo) {
              return todoService.addTodo(todo);
       }

       @GetMapping("/todos/{id}")
       public Todo getTodoById(@PathVariable("id") int todoId) {
              return todoService.getTodoById(todoId);
       }

       @PutMapping("/todos/{id}")
       public Todo updateTodo(@PathVariable("id") int todoId, @RequestBody Todo todo) {
              return todoService.updateTodo(todoId, todo);
       }

       @DeleteMapping("/todos/{id}")
       public void deleteTodo(@PathVariable("id") int todoId) {
              todoService.deleteTodo(todoId);
       }
}