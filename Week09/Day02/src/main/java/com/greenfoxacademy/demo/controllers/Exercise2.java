package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseGreeter;
import com.greenfoxacademy.demo.models.ModelAndError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise2 {
  
  @Autowired
  ErrorMessage errorMessage;
  @Autowired
  ExerciseGreeter greeter;
  
  @GetMapping("/greeter")
  public ModelAndError greetResponse(@RequestParam(value = "name", required = false) String name,
                                     @RequestParam(value = "title", required = false) String title){
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
          errorMessage.setError("Please provide a name");
      } else if (title == null){
          errorMessage.setError("Please provide a title");
    }
  }
}
