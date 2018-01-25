package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseDoubling;
import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
  
  private final ExerciseDoubling exerciseDoubling;
  private final ErrorMessage error;
  private final LogService logService;
  
  @Autowired
  public Exercise1(ExerciseDoubling exerciseDoubling, ErrorMessage error, LogService logService) {
    this.exerciseDoubling = exerciseDoubling;
    this.error = error;
    this.logService = logService;
  }
  
  @GetMapping("/doubling")
  public ModelAndError doubling(@RequestParam(value = "input", required = false) Integer input) {
    logService.createLog("/doubling", "input= " + input);
    if(exerciseDoubling.doubling(input)){
     return exerciseDoubling;
    } else {
      error.setError("Please provide an input!");
      return error;
    }
  }
}
