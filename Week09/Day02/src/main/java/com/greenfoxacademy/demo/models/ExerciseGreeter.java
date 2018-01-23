package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
@Setter
public class ExerciseGreeter extends ModelAndError {

  @JsonIgnore
  private String name;
  @JsonIgnore
  private String title;
  @JsonProperty("welcome_message")
  private String welcomeMessage;
  
  public String getWelcomeMessage() {
    return "Oh, hi there " + this.name + ", my dear " + title +"!";
  }
}
