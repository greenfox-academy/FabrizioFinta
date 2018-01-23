package com.greenfoxacademy.demo.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
public class ExerciseDoubling extends ModelAndError {

  private int received;
  private int result;

  
  public boolean doubling(Integer received){
    if(received != null){
      this.received = received;
      this.result = received*2;
      return true;
    } else {}
    return false;
  }
}
