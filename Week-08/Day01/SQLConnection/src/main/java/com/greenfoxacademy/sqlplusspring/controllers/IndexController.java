package com.greenfoxacademy.sqlplusspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
  
  @GetMapping ("")
  public String loginPage(){
    return "redirect:/todo";
  }
  
}
