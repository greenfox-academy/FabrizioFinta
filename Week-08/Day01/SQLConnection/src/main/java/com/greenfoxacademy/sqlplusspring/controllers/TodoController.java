package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.models.Todo;
import com.greenfoxacademy.sqlplusspring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
  
  @Autowired
  TodoRepo cruds;
  
  @GetMapping ("/todo")
  public String todoGetController(){
    return "todo";
  }
  
  @GetMapping({"/", "/list"})
  public String list(Model model){
    List<Todo> todos = new ArrayList<>();
    cruds.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todo";
  }
  
}
