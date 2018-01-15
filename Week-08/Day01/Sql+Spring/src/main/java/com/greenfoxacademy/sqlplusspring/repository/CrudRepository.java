package com.greenfoxacademy.sqlplusspring.repository;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;

public interface CrudRepository extends org.springframework.data.repository.CrudRepository<Todo, Integer> {
}
