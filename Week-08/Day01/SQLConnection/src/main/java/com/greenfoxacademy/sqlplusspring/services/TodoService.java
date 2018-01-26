package com.greenfoxacademy.sqlplusspring.services;

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
  
  public void addTodo(Todo todo) {
    todoRepo.save(todo);
  }
  
  public void deleteTodo(int id) {
    todoRepo.delete(id);
  }
  
  public void modifyTodo(Todo todo) {
    todoRepo.save(todo);
  }
  
  public void assignTodo(int assigneeId, int todoId){
    getTodo(todoId).setAssignee(assigneeService.getAssignee(assigneeId));
    modifyTodo(getTodo(todoId));
  }
  
  public List<Todo> filterIsDoneAndTitle(String title, Boolean isDone) {
    if(title != null || isDone != null){
      return todoRepo.findAllByDoneIsOrTitleContains(isDone, title);
    } else {
      return (List<Todo>) todoRepo.findAll();
    }
  }
  
  public List<Todo> filetTitleOrIsDone(String title, Boolean isDone){
    if (!title.isEmpty() && isDone != null) {
       return filterIsDoneAndTitle(title, isDone);
    } else if (!title.isEmpty() && isDone == null) {
      return filterTitle(title);
    } else if (title.isEmpty() && isDone != null) {
      return filterIsDone(isDone);
    } else {
      return getAllTodo();
    }
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
  
  public List<Todo> filterTodosByAssignee(int assigneeId){
    if (assigneeService.getAssignee(assigneeId).getTodos().isEmpty()){
      return assigneeService.getAssignee(assigneeId).getTodos();
    }
    return todoRepo.findAllByAssigneeContains(assigneeService.getAssignee(assigneeId).getName());
  }
}
