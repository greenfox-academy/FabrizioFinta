package com.greenfoxacademy.demo.models.arrayHandlerResults;

import com.greenfoxacademy.demo.models.ModelAndError;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@Component
@NoArgsConstructor
public class ExerciseArrayHandlerResultArray extends ModelAndError {
  
  ArrayList<Integer> resultArray;
  
}
