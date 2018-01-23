package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseDoubling;
import com.greenfoxacademy.demo.models.ModelAndError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {

  @Autowired
  ExerciseDoubling exerciseDoubling;
  @Autowired
  ErrorMessage error;
  
  @GetMapping("/doubling")
  public ModelAndError doubling(@RequestParam(value = "input", required = false) Integer input) {
    if(exerciseDoubling.doubling(input)){
     return exerciseDoubling;
    } else {
      error.setError("Please provide an input!");
      return error;
    }
  }
}
