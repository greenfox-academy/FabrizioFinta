package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import com.greenfoxacademy.sqlplusspring.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
  
  @Autowired
  TodoService todoService;
  
  
  @GetMapping({"", "/list"})
  public String list(@RequestParam (value = "title", required = false) String title, @RequestParam (value = "isActive", required = false) Boolean isActive, Model model) {
    if (title != null && isActive != null){
      model.addAttribute("todos", todoService.filterIsDoneORTitle(title,isActive));}
    else if (title == null && isActive == null){
      model.addAttribute("todos", todoService.getAllTodo());
    } else if (title != null && isActive == null){
      model.addAttribute("todos", todoService.filterTitle(title));
    } else if (title == null && isActive != null) {
      model.addAttribute("todos", todoService.filterIsDone(isActive));
    }
    model.addAttribute("searchPlaceholder", title);
    return "todo";
  }
  
  @GetMapping("/add")
  public String addTodo(Model model){
    model.addAttribute("todo", new Todo());
    return "add";
  }
  
  @PostMapping("/add")
  public String postNewTodo(@ModelAttribute Todo newTodo){
    todoService.addTodo(newTodo);
    return "redirect:";
  }
  
  @PostMapping("{todoId}/delete")
  public String deleteTodo(@PathVariable int todoId){
    todoService.deleteTodo(todoId);
    return "redirect:";
  }
  
  @GetMapping("{todoId}/edit")
  public String getEditPage(@PathVariable int todoId, Model model){
    model.addAttribute("todo", todoService.getTodo(todoId));
    return "edit";
  }
  
  @PostMapping("{todoId}/edit")
  public String editTodo(@PathVariable int todoId, @ModelAttribute Todo todo){
    todo.setId(todoId);
    todoService.modifyTodo(todo);
    return "redirect:";
  }
}
