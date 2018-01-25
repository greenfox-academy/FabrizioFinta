package com.greenfoxacademy.demo.controllers;

import com.greenfoxacademy.demo.models.ModelAndError;
import com.greenfoxacademy.demo.models.sithTextModels.ExerciseSithText;
import com.greenfoxacademy.demo.models.sithTextModels.ExerciseSithRegularText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise8 {
  
  final ModelAndError errorMessage;
  final ExerciseSithText sithText;
  
  @Autowired
  public Exercise8(ModelAndError errorMessage, ExerciseSithText sithText) {
    this.errorMessage = errorMessage;
    this.sithText = sithText;
  }
  
  @PostMapping("/sith")
  public ModelAndError translateToASithText(@RequestBody ExerciseSithRegularText text){
    if (text == null || text.getText().length()==0){
      return errorMessage.setErrorAndReturn(sithText.getDefaultSithText());
    } else {
        sithText.translateToSith(text.getText());
        return sithText;
    }
  }
}
