package com.todoapp.todoapp.repository;

import com.todoapp.todoapp.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    // Define custom queries if needed
}

