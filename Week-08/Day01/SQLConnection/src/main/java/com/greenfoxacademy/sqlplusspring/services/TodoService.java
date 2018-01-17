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
  
  public Todo getTodo(int id){
    return todoRepo.findOne(id);
  }
  
  public List<Todo> getAllTodo(){
  return (List<Todo>) todoRepo.findAll();
  }
  
  public List<Todo> filterIsDoneORTitle (String title, Boolean isDone){
    return todoRepo.findAllByIsDoneIsAndTitleContaining(isDone, title);
  }
  
  public List<Todo> filterIsDone(boolean isDone){
    return todoRepo.findAllByIsDoneIs(isDone);
  }
  
  public List<Todo> filterTitle(String title){
    return todoRepo.findAllByTitleContainingOrderByTitle(title);
    }
    
  public void addTodo(Todo todo){
    todoRepo.save(todo);
  }
  
  public void deleteTodo(int id){
    todoRepo.delete(id);
  }
  
  
  public void modifyTodo(Todo todo){
    todoRepo.save(todo);
  }
}
