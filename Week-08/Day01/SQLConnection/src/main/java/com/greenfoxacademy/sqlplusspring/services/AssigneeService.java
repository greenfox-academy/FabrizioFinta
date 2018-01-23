package com.greenfoxacademy.sqlplusspring.services;

import com.greenfoxacademy.sqlplusspring.models.Assignee;
import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.AssigneeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {
  
  @Autowired
  AssigneeRepo assigneeRepo;
  
  @Autowired
  TodoService todoService;
  
  public List<Assignee> getAllAssignee(){
    return (List<Assignee>) assigneeRepo.findAll();
  }
  
  public Assignee getAssignee(int id){
    return (Assignee) assigneeRepo.findOne(id);
  }
  
  public void deleteAssignee(int id){
    assigneeRepo.delete(id);
  }
  
  public void addAssignee(Assignee assignee){
    assigneeRepo.save(assignee);
  }
  
  public void modifyAssignee(Assignee assignee){
    assigneeRepo.save(assignee);
  }
}
