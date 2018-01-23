package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseAppendA;
import com.greenfoxacademy.demo.models.ModelAndError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Exercise3 {

  
  @Autowired
  ExerciseAppendA appendA;
  @Autowired
  ErrorMessage errorMessage;
  
  @GetMapping("/appenda/{appendable}")
  public ModelAndError getAppendedWord(@PathVariable (value = "appendable") String appendable){
    if(appendable != null){
      appendA.setAppended(appendable);
      return appendA;
    } else {
        errorMessage.setError("404");
        return errorMessage;
    }
  }
}
