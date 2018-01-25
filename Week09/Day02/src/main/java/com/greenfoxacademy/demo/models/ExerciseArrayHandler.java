package com.greenfoxacademy.demo.models;

import com.greenfoxacademy.demo.factories.ExerciseArrayHandlerFactory;
import com.greenfoxacademy.demo.models.arrayHandlerResults.ExerciseArrayHandlerResult;
import com.greenfoxacademy.demo.models.arrayHandlerResults.ExerciseArrayHandlerResultArray;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class ExerciseArrayHandler {
  
  private String what;
  private ArrayList<Integer> numbers;
  
  ExerciseArrayHandlerFactory arrayHandlerFactory;
  
  @Autowired
  public ExerciseArrayHandler(ExerciseArrayHandlerFactory arrayHandlerFactory) {
    this.arrayHandlerFactory = arrayHandlerFactory;
  }
  
  public ModelAndError checkAndDoSituation(){
    if(what.equalsIgnoreCase("sum")){
      return sumNumbersOfTheArray();
    } else if (what.equalsIgnoreCase("multiply")){
        return multiplyNumbersOfTheArray();
    } else if (what.equalsIgnoreCase("double")) {
        return doubleNumbersOfTheArray();
    } else {
      return null;
    }
  }
  
  private ExerciseArrayHandlerResult sumNumbersOfTheArray(){
    Integer sum = 0;
    ExerciseArrayHandlerResult result = arrayHandlerFactory.produceArrayHandlerResult();
    for (Integer number : numbers) {
      sum += number;
    }
    result.setResult(sum);
    return result;
  }
  
  private ExerciseArrayHandlerResult multiplyNumbersOfTheArray(){
    Integer multiplied = 1;
    ExerciseArrayHandlerResult result = arrayHandlerFactory.produceArrayHandlerResult();
    for (Integer number : numbers) {
      multiplied = multiplied * number;
    }
    result.setResult(multiplied);
    return result;
  }
  
  private ExerciseArrayHandlerResultArray doubleNumbersOfTheArray(){
    ExerciseArrayHandlerResultArray result = arrayHandlerFactory.produceArrayHandlerResultArrayFactory();
    ArrayList<Integer> doubled = new ArrayList<>();
    for (Integer number : numbers) {
      doubled.add(number * 2);
    }
    result.setResultArray(doubled);
    return result;
  }
}
