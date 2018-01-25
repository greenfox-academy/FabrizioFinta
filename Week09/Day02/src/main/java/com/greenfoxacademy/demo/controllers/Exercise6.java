package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.factories.ExerciseArrayHandlerFactory;
import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseArrayHandler;
import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise6 {
  
  private final ErrorMessage errorMessage;
  private final LogService logService;
  private final ExerciseArrayHandlerFactory arrayHandlerFactory;
  
  @Autowired
  public Exercise6(ErrorMessage errorMessage, ExerciseArrayHandlerFactory arrayHandlerFactory, LogService logService) {
    this.errorMessage = errorMessage;
    this.arrayHandlerFactory = arrayHandlerFactory;
    this.logService = logService;
  }
  
  @PostMapping("/arrays")
  public ModelAndError postAndReturnResult(@RequestBody ExerciseArrayHandler input){
    logService.createLog("/arrays", "input = " + input);
    try{
      return  input.checkAndDoSituation();
    } catch (NullPointerException e){
        errorMessage.setError("Please provide what to do with the numbers!");
        return errorMessage;
    }
  }
  
}
