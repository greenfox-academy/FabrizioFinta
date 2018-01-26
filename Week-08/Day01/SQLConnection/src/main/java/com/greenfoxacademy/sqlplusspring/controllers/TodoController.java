package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import com.greenfoxacademy.sqlplusspring.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller("/todo")
public class TodoController {
  
  @Autowired
  TodoService todoService;
  
  @GetMapping("")
  public String list(@RequestParam (value = "title", required = false) String title, @RequestParam (value = "isActive", required = false) Boolean isActive, Model model) {
    if(title != null || isActive != null) {
      model.addAttribute("todos", todoService.filetTitleOrIsDone(title,isActive));
    } else {
      model.addAttribute("todos", todoService.getAllTodo());
      title = "Search...";
    }
    model.addAttribute("searchPlaceholder", title);
    return "todo";
  }
  
  private void listAdderModelAttributor(Model model, Boolean isActive, String title) {
  }
  
  @GetMapping("add")
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
