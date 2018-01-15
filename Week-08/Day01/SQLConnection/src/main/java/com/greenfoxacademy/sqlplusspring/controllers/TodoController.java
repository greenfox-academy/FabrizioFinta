package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
      todos = StreamSupport.stream(cruds.findAll().spliterator(), false).filter(todo -> todo.isDone() == true).collect(Collectors.toList());
    } else if(!isActive) {
      todos = StreamSupport.stream(cruds.findAll().spliterator(), false).filter(todo -> todo.isDone() == false).collect(Collectors.toList());
    }
    model.addAttribute("todos", todos);
    return "todo";
  }
}
