package com.greenfoxacademy.sqlplusspring.repository;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends org.springframework.data.repository.CrudRepository<Todo, Integer> {
}
