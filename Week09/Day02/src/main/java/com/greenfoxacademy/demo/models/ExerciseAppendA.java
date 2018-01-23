package com.greenfoxacademy.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class ExerciseAppendA extends ModelAndError {

  private String appended;
  
  public String getAppended() {
    return appended + "a";
  }
}
