package com.greenfoxacademy.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class ExerciseDoUntil extends ModelAndError {
  
  private Integer until;
  private int result;

  public boolean doUntil(String what) {
    
    if (what != null && until != null && (what.equalsIgnoreCase("sum") || what.equalsIgnoreCase("factor"))) {
      if (what.equalsIgnoreCase("sum")) {
        result = 0;
        for (int i = 0; i <= until; i++) {
          result += i;
        }
      } else {
          result = 1;
          for (int i = 1; i <= until; i++) {
           result = result*i;
          }
      }
      return true;
    } else {
        return false;
    }
  }
}
