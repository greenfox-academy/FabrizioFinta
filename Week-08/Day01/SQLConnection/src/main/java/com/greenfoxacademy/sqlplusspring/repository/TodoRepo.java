package com.greenfoxacademy.sqlplusspring.repository;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Integer> {
}
