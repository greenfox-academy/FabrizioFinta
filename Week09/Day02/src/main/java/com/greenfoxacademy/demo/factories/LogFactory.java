package com.greenfoxacademy.demo.factories;

import com.greenfoxacademy.demo.models.ExerciseLog;
import org.springframework.stereotype.Component;

@Component
public class LogFactory {
  
  public ExerciseLog produceLogObjectWithFields(String endpoint, String data){
    ExerciseLog log = new ExerciseLog(endpoint, data);
    return log;
  }
}
