package com.greenfoxacademy.demo.factories;

import com.greenfoxacademy.demo.models.arrayHandlerResults.ExerciseArrayHandlerResult;
import com.greenfoxacademy.demo.models.arrayHandlerResults.ExerciseArrayHandlerResultArray;
import org.springframework.stereotype.Component;

@Component
public class ExerciseArrayHandlerFactory {

  public ExerciseArrayHandlerResult produceArrayHandlerResult(){
    ExerciseArrayHandlerResult myObject = new ExerciseArrayHandlerResult();
    return myObject;
  }
  
  public ExerciseArrayHandlerResultArray produceArrayHandlerResultArrayFactory(){
    ExerciseArrayHandlerResultArray myObject = new ExerciseArrayHandlerResultArray();
    return myObject;
  }
}
