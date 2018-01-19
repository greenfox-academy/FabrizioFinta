package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Assignee;
import com.greenfoxacademy.sqlplusspring.services.AssigneeService;
import com.greenfoxacademy.sqlplusspring.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AssigneeController {
  
  @Autowired
  AssigneeService assigneeService;
  @Autowired
  TodoService todoService;
  
  @PostMapping("/addAssignee")
  public String addAssignee(@ModelAttribute Assignee assignee){
    assigneeService.addAssignee(assignee);
    return "redirect:assigneeManager";
  }
  
  @GetMapping("/assigneeManager")
  public String assigneeManager(Model model){
    model.addAttribute("assigneeList",assigneeService.getAllAssignee());
    model.addAttribute("newAssignee", new Assignee());
    return "assigneeManager";
  }
  
  @PostMapping("assigneeManager")
  public String assigneeOperation(@RequestParam(value = "operation", required = false) String operation, @RequestParam(value = "id", required = false) int id){
    if(operation.equalsIgnoreCase("edit")){
      
      return "redirect:editAssignee/" + id;
    }
    if(operation.equalsIgnoreCase("delete")){
      assigneeService.deleteAssignee(id);
    }
    return "redirect:assigneeManager";
  }
  
  @GetMapping("/editAssignee/{id}")
  public String editAssigneePage(@PathVariable int id, Model model){
    model.addAttribute("assignee", assigneeService.getAssignee(id));
    model.addAttribute("availableTodos", todoService.filterTodosByAvailability(true));
    return "editAssignee";
  }
  
  @PostMapping("/editAssignee/{id}/assignee")
  public String editAssignee(@PathVariable(value = "id") int assigneeId, @ModelAttribute Assignee assignee){
    assignee.setId(assigneeId);
    assigneeService.modifyAssignee(assignee);
    return "redirect:assigneeManager";
  }
  
  @PostMapping("/editAssignee/{id}/todo")
  public String assignTodo(@PathVariable int id, @RequestParam (value = "todoId") int todoId){
    todoService.assignTodo(todoId, id);
    return "redirect:editAssignee";
  }
}