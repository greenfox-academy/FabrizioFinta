package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller
@RequestMapping("/todo")
public class TodoController {
  
  @Autowired
  TodoRepo cruds;
  
  @GetMapping({"/", "/list"})
  public String list(@RequestParam (value = "isActive", required = false) Boolean isActive, Model model) {
    List<Todo> todos = new ArrayList<>();
    if(isActive == null){
      cruds.findAll().forEach(todos:: add);
    }
    else if (isActive) {
      todos = StreamSupport.stream(cruds.findAll().spliterator(), false).filter(todo -> todo.getIsDone() == true).collect(Collectors.toList());
    } else if(!isActive) {
      todos = StreamSupport.stream(cruds.findAll().spliterator(), false).filter(todo -> todo.getIsDone() == false).collect(Collectors.toList());
    }
    model.addAttribute("todos", todos);
    return "todo";
  }
  
  @GetMapping("/add")
  public String addTodo(Model model){
    model.addAttribute("todo", new Todo());
    return "add";
  }
  
  @PostMapping("/add")
  public String postNewTodo(@ModelAttribute Todo newTodo){
    cruds.save(newTodo);
    return "redirect:/todo/";
  }
  
  @PostMapping("{todoId}/delete")
  public String deleteTodo(@PathVariable int todoId){
    cruds.delete(todoId);
    return "redirect:/todo/";
  }
  
  @GetMapping("{todoId}/edit")
  public String getEditPage(@PathVariable int todoId, Model model){
    model.addAttribute("todo", cruds.findOne(todoId));
    return "edit";
  }
  
  @PostMapping("{todoId}/edit")
  public String editTodo(@PathVariable int todoId, @ModelAttribute Todo todo){
    todo.setID(todoId);
    cruds.save(todo);
    return "redirect:/todo/";
  }
}
