package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseAppendA;
import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise3 {
  
  
  private final ExerciseAppendA appendA;
  private final ErrorMessage errorMessage;
  private final LogService logService;
  
  @Autowired
  public Exercise3(ExerciseAppendA appendA, ErrorMessage errorMessage, LogService logService) {
    this.appendA = appendA;
    this.errorMessage = errorMessage;
    this.logService = logService;
  }
  
  @GetMapping("/appenda/{appendable}")
  public ModelAndError getAppendedWord(@PathVariable (value = "appendable") String appendable){
    logService.createLog("/appenda", "appendable = " + appendable);
    if(appendable != null){
      appendA.setAppended(appendable);
      return appendA;
    } else {
        errorMessage.setError("404");
        return errorMessage;
    }
  }
}
