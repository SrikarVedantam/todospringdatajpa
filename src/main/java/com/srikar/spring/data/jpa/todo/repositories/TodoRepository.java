package com.srikar.spring.data.jpa.todo.repositories;

import com.srikar.spring.data.jpa.todo.domain.Todo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vedantas on 4/7/2018.
 */

public interface TodoRepository extends CrudRepository<Todo, Long> {
    Iterable<Todo> findAll();
    long count();
}
