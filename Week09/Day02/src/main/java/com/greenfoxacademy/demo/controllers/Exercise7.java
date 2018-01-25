package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ErrorMessage;
import com.greenfoxacademy.demo.models.ExerciseLogList;
import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.jws.WebParam;
import javax.validation.constraints.Null;

@RestController
public class Exercise7 {
  
  private final ModelAndError errorMessage;
  private final LogService logService;
  
  @Autowired
  public Exercise7(ModelAndError errorMessage, LogService logService) {
    this.errorMessage = errorMessage;
    this.logService = logService;
  }
  
  @GetMapping("log")
  public ExerciseLogList getLogList(){
    return logService.updateAndGetLogList();
  }
  
  @GetMapping("log/{id}")
  public ModelAndError deleteLogList(@PathVariable(value = "id", required = false) Integer id){
    try{
      logService.deleteLog(id);
      return logService.updateAndGetLogList();
    } catch (NullPointerException e) {
        return errorMessage.setErrorAndReturn("Please provide a not null ID in the URL!");
    } catch (EmptyResultDataAccessException e){
        return errorMessage.setErrorAndReturn("There is no existing log with ID: " + id);
    } catch (MethodArgumentTypeMismatchException e) {
        return errorMessage.setErrorAndReturn("The ID format supposed to be an integer!");
    }
  }
}

