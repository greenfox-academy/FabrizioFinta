package com.greenfoxacademy.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloUserWebControler {
  
  AtomicLong counter = new AtomicLong();
  
  @GetMapping ("/web/greetingCount")
  public String greeting(Model model, @RequestParam(value = "name") String name){
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    return "greeting";
  }
}
