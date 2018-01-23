package com.greenfoxacademy.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {
  
  @GetMapping("")
  public String getFrontendPage(){
    return "index";
  }
  
}
