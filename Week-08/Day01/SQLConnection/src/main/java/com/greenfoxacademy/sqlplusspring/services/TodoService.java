package com.greenfoxacademy.sqlplusspring.services;

import com.greenfoxacademy.sqlplusspring.models.Assignee;
import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
  
  @Autowired
  private TodoRepo todoRepo;
  @Autowired
  private AssigneeService assigneeService;
  
  public Todo getTodo(int id) {
    return todoRepo.findOne(id);
  }
  
  public List<Todo> getAllTodo() {
    return (List<Todo>) todoRepo.findAll();
  }
  
  public List<Todo> filterIsDoneORTitle(String title, Boolean isDone) {
    return todoRepo.findAllByDoneIsAndTitleContaining(isDone, title);
  }
  
  public List<Todo> filterIsDone(boolean isDone) {
    return todoRepo.findAllByDoneIs(isDone);
  }
  
  public List<Todo> filterTitle(String title) {
    return todoRepo.findAllByTitleContainingOrderByTitle(title);
  }
  
  public List<Todo> filterTodosByAvailability(boolean availableStatus){
    if (availableStatus){
      return todoRepo.findAllByDoneIsFalseAndAssigneeIsNull();
    } else {
      return todoRepo.findAllByDoneIsFalseAndAssigneeIsNotNull();
    }
  }
  
  public void addTodo(Todo todo) {
    todoRepo.save(todo);
  }
  
  public void deleteTodo(int id) {
    todoRepo.delete(id);
  }
  
  
  public void modifyTodo(Todo todo) {
    todoRepo.save(todo);
  }
  
  public void assignTodo(int todoId, int assigneeId) {
    getTodo(todoId)
            .setAssignee(assigneeService
                                 .getAssignee(assigneeId));
  }
}