package com.greenfoxacademy.sqlplusspring.controllers;

import com.greenfoxacademy.sqlplusspring.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
  
  @Autowired
  CrudRepository cruds;
  
  @GetMapping("/todo")
  public String todoGetController(){
    return "todo";
  }
  
  @GetMapping({"/", "/list"})
  public String list(Model model){
    return "todo";
  }
}
