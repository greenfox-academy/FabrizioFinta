package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseDoUntil;
import com.greenfoxacademy.demo.models.ModelAndError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise4 {
  
  @Autowired
  ErrorMessage errorMessage;
  
  @PostMapping("/dountil/{what}")
  public ModelAndError doUntilWhat(@PathVariable(value = "what", required = false) String what, @RequestBody ExerciseDoUntil exerciseDoUntil){
    if(exerciseDoUntil.doUntil(what)){
      return exerciseDoUntil;
    } else{
        errorMessage.setError("Please provide a number!");
        return errorMessage;
    }
  }

}
