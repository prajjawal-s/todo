package com.todoapp.todoapp.service;


import java.util.List;
import com.todoapp.todoapp.entity.Todo;
public interface ToDoServiceDel {

	List<Todo> getAllUsers();
//	Todo getTodoById();
	Todo createTodo(Todo todo);
	Todo updateTodo(Long id,Todo todo);
//	Todo deleteTodo(Long id);
	Todo getTodoById(Long id);
//	Todo completeTodo(Long id,Todo todo);
	long getTodoCount();
    Todo deleteById(Long id);
    boolean existsById(Long id);
//    Todo titleTodo(Long id,Todo todo);
    Todo patchTodo(Long id,Todo todo);
//    Todo descriptionTodo(Long id,Todo todo);
//    Todo compTodo(Long id,Todo todo);
}

