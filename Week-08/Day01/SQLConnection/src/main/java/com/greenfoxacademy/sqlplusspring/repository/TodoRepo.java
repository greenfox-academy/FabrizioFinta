package com.greenfoxacademy.sqlplusspring.repository;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends CrudRepository<Todo, Integer> {

  List<Todo> findAllByTitleContainingOrderByTitle(String title);
  List<Todo> findAllByDoneIs(boolean isDone);
  List<Todo> findAllByDoneIsAndTitleContaining (boolean isDone, String title);
  List<Todo> findAllByDoneIsFalseAndAssigneeIsNull();
  List<Todo> findAllByDoneIsFalseAndAssigneeIsNotNull();
}
