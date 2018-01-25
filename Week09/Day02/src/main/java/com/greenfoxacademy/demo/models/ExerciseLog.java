package com.greenfoxacademy.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ExerciseLog {
  
  public ExerciseLog(String endpoint, String data){
    this.endpoint = endpoint;
    this.data = data;
  }
  
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  long id;
  @CreationTimestamp
  @JsonIgnore
  Timestamp createdAt;
  String endpoint;
  String data;

}
