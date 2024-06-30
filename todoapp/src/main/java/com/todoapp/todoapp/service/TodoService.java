package com.todoapp.todoapp.service;
import com.todoapp.todoapp.entity.Todo;
import com.todoapp.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import java.util.Optional;

import com.todoapp.todoapp.exceptions.Excep;
import com.todoapp.todoapp.repository.JPARepository;
import com.todoapp.todoapp.service.ToDoServiceDel;
import com.todoapp.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class TodoService implements ToDoServiceDel {

	@Autowired
	private TodoRepository repository;


	@Override
	public List<Todo> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public Todo getTodoById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Todo createTodo(Todo todo) {
		todo.setCreatedAt(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS));
		return repository.save(todo);
	}

	@Override
	public Todo updateTodo(Long id,Todo todo) {
		// TODO Auto-generated method stub
		   Todo existingTodo = repository.findById(id).orElse(null); 
	        if (existingTodo != null) { 
	            existingTodo.setTitle(todo.getTitle()); 
	            existingTodo.setDescription(todo.getDescription()); 
	            existingTodo.setCompleted(todo.isCompleted()); 
	            return repository.save(existingTodo); 
	        } else { 
	            return null; 
	        } 

	}

	@Override
	public Todo deleteById(Long id) {
		repository.deleteById(id);
		return null;
	}
	
	@Override
	public boolean existsById(Long id) {
		if(!repository.existsById(id))
	       return false;
		else {
			return true;
    }
	
	}
	
	@Override
	public long getTodoCount() {
       return repository.count();
 
    }

	
	@Override
	public Todo patchTodo(Long id,Todo todo) {
		// TODO Auto-generated method stub
		   Todo existingTodo = repository.findById(id).orElse(null); 
	        if (existingTodo != null) { 
        	
	        	if (todo.getTitle() != null) {
	        		existingTodo.setTitle(todo.getTitle());
	        	}
	        	else if (todo.getDescription() != null) {
	        		existingTodo.setDescription(todo.getDescription());
	        	}
	        	else if (todo.isCompleted()) {
	        		existingTodo.setCompleted(todo.isCompleted());
	        	}
	            return repository.save(existingTodo); 
	        } else { 
	            return null; 
	        } 

	}

}