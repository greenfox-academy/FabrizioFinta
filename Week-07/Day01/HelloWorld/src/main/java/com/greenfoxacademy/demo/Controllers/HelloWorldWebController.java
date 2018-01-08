package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldWebController {
 
 @RequestMapping("/web/greeting")
 public String greeting(Model model){
   model.addAttribute("name", " World");
   return "greeting";
  }
}
