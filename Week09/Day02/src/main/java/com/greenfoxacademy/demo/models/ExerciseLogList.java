package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.demo.services.LogService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
@Component
@NoArgsConstructor
public class ExerciseLogList extends ModelAndError {
  
  
  List<ExerciseLog> entries;
  @JsonProperty("entry_count")
  Integer entryCount;
}

