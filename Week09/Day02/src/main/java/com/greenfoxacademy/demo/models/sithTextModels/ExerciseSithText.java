package com.greenfoxacademy.demo.models.sithTextModels;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.demo.models.ModelAndError;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@Getter
@Setter
@Component
public class ExerciseSithText extends ModelAndError {
  
  @JsonProperty("sith_text")
  private String sithText;
  @JsonIgnore
  private ArrayList<String> dictionary;
  
  public ExerciseSithText() {
    dictionary = new ArrayList<>(
            Arrays.asList(
              "Err",
              "Arrg",
              "Uhmm",
              "Grrff"
            )
    );
  }
  
  public String getDefaultSithText() {
    return "Feed me some text you have to, padawan young you are. Hmmm.";
  }
  
  public void translateToSith(String originalText) {
    ArrayList<String> textArray = new ArrayList<>(Arrays.asList(originalText.split(" ")));
    if(textArray.size()%2==0){
      for (int i = 0; i < textArray.size()/2; i++) {
        Collections.swap(textArray, i, i+1);
      }
    } else {
      for (int i = 0; i < textArray.size()-1/2; i++) {
        Collections.swap(textArray,i,i+1);
      }
    }
    for (int i = 0; i < textArray.size(); i++) {
      sithText = sithText + textArray.get(i);
    }
  }
}
