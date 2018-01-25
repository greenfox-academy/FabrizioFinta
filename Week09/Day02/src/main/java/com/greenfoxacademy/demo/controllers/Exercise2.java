package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseGreeter;
import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
  
  private final ErrorMessage errorMessage;
  private final ExerciseGreeter greeter;
  private final LogService logService;
  
  @Autowired
  public Exercise2(ErrorMessage errorMessage, ExerciseGreeter greeter, LogService logService) {
    this.errorMessage = errorMessage;
    this.greeter = greeter;
    this.logService = logService;
  }
  
  @GetMapping("/greeter")
  public ModelAndError greetResponse(@RequestParam(value = "name", required = false) String name,
                                     @RequestParam(value = "title", required = false) String title){
    logService.createLog("/greeter", "name = " + name + "& title = " + title);
    if(name == null || title == null){
      errorMessageGenerator(name, title);
      return errorMessage;
    } else {
      greeter.setName(name);
      greeter.setTitle(title);
      return greeter;
    }
  }
  
  private void errorMessageGenerator(String name, String title) {
    if(name == null && title == null){
        errorMessage.setError("Please provide inputs!");
      } else if(name == null){
          errorMessage.setError("Please provide a name!");
      } else if (title == null){
          errorMessage.setError("Please provide a title!");
    }
  }
}
